package com.bpl_t.joy.root.bpl.fragment_list;


import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.bpl_t.joy.root.bpl.HttpHandle.HttpHandler;
import com.bpl_t.joy.root.bpl.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by root on 10/7/17.
 */

public class FragmentScoreBord extends Fragment {

    private String TAG =FragmentScoreBord.class.getSimpleName();
    private ProgressDialog pDialog;
    private ListView lv;
    private SwipeRefreshLayout swipeTORefresh;



    //crickapi

    private static String url = "http://cricapi.com/api/cricket/?apikey=mulMFCkQoIaPrM5bDxRM14F0Uq03";

    ArrayList<HashMap<String, String>> DataList;

    public FragmentScoreBord() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_scorebord, container, false);
        swipeTORefresh=rootView.findViewById(R.id.swipe_refresh_layout);

        DataList = new ArrayList<>();
        lv =rootView.findViewById(R.id.list);
        new GetData().execute(); //????

        //swipetorefresh
        swipeTORefresh.setOnRefreshListener(
                new SwipeRefreshLayout.OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        if(DataList!=null){
                            DataList.clear();
                        }

                        new GetData().execute();


                        swipeTORefresh.setRefreshing(false);
                    }
                }
        );



        return rootView;
    }

    private class GetData extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Showing progress dialog
            pDialog = new ProgressDialog(getContext());
            pDialog.setMessage("Please wait...");
            pDialog.setCancelable(false);
            pDialog.show();

        }

        @Override
        protected  Void doInBackground(Void... params) {

            HttpHandler sh = new HttpHandler();

            // Making a request to url and getting response
            String jsonStr = sh.makeServicesCall(url);

            Log.e(TAG, "Response from url: " + jsonStr);

            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);

                    // Getting JSON Array node
                    JSONArray datas = jsonObj.getJSONArray("data");

                    // looping through All data
                    for (int i = 0; i < datas.length(); i++) {
                        JSONObject c = datas.getJSONObject(i);

                        String unique_id = c.getString("unique_id");
                        String description = c.getString("description");
                        String title = c.getString("title");

                        // tmp hash map for single contact
                        HashMap<String, String> data = new HashMap<>();

                        // adding each child node to HashMap key => value
                        data.put("unique_id", unique_id);
                        data.put("description", description);
                        data.put("title", title);

                        // adding contact to contact list
                        DataList.add(data);


                    }
                } catch (final JSONException e) {
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getContext(),
                                    "Json parsing error: " + e.getMessage(),
                                    Toast.LENGTH_LONG)
                                    .show();
                        }
                    });

                }
            } else {
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getContext(),
                                "Couldn't get json from server. Check LogCat for possible errors!",
                                Toast.LENGTH_LONG)
                                .show();
                    }
                });

            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            // Dismiss the progress dialog
            if (pDialog.isShowing())
                pDialog.dismiss();
            listAdapter();

        }

        void listAdapter(){
            ListAdapter adapter = new SimpleAdapter(
                    getContext(), DataList,
                    R.layout.scorebord_list_iteam, new String[]{"unique_id", "title",
                    "description"}, new int[]{R.id.unique_id,
                    R.id.title, R.id.description});

            lv.setAdapter(adapter);
        }

    }
}
