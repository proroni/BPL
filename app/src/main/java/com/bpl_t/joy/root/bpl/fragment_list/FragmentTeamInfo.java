package com.bpl_t.joy.root.bpl.fragment_list;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bpl_t.joy.root.bpl.ImageNewsSlider.ImageAdapter;
import com.bpl_t.joy.root.bpl.MainActivity;
import com.bpl_t.joy.root.bpl.R;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.LogRecord;

import me.relex.circleindicator.CircleIndicator;

/**
 * Created by root on 10/7/17.
 */

public class FragmentTeamInfo extends Fragment {
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static  Integer[] Images = {R.drawable.photobomb1, R.drawable.photobomb2, R.drawable.photobomb3, R.drawable.photobomb4, R.drawable.photobomb5};
    private ArrayList<Integer> XMENArray = new ArrayList<Integer>();




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_team_info, container, false);
        imageSlider();

        mPager = rootView.findViewById(R.id.viewPageAndroid);
        ImageAdapter adapter =new ImageAdapter(XMENArray,getActivity());
        mPager.setAdapter(adapter);
        CircleIndicator indicator =  rootView.findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

    return rootView;}

    private void imageSlider() {
        for (int i = 0; i < Images.length; i++)
            XMENArray.add(Images[i]);


         // Auto start of viewpager
         final Handler handler =new Handler();

         final Runnable Update=new Runnable() {
             @Override
             public void run() {
                 if (currentPage == Images.length) {
                     currentPage = 0;
                 }
                 mPager.setCurrentItem(currentPage++, true);
             }
         };
         Timer swipeTimer = new Timer();
         swipeTimer.schedule(new TimerTask() {
             @Override
             public void run() {
                 handler.post(Update);
             }
         }, 2500, 2500);
     }


    @Override
    public void onDestroyView() {
        super.onDestroyView();


    }



}





































