package com.bpl_t.joy.root.bpl.Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bpl_t.joy.root.bpl.PlayerData;
import com.bpl_t.joy.root.bpl.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 10/21/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    Context context;
    ArrayList<PlayerData>playerDatas;


    public RecyclerAdapter(Context c, List<PlayerData> playerDatas){
        this.playerDatas = (ArrayList<PlayerData>) playerDatas;
        this.context=c;
    }
    //initialize holder
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.players_info_cardview,null);
        RecyclerViewHolder holder=new RecyclerViewHolder(v);


        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.personName.setText(playerDatas.get(position).getName());
        holder.personAge.setText(playerDatas.get(position).getAge());
        holder.personPhoto.setImageResource(playerDatas.get(position).getPhotoId());

        //holder listner
        holder.iteamClickListner(new iteamClickListner() {
            @Override
            public void onItemClick(View v, int position) {
                //show players broad information
                Toast.makeText(context,"job done",Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return playerDatas.size();
    }
}
