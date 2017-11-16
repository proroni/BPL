package com.bpl_t.joy.root.bpl.RecycleviewShedule;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.bpl_t.joy.root.bpl.R;
import com.bpl_t.joy.root.bpl.Recycler.iteamClickListner;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 10/28/17.
 */

public class RecycleViewScheduleAdapter extends  RecyclerView.Adapter<RecycleViewScheduleHolder>  {
    Context context;
    ArrayList<GameSchedule> gameSchedule;


    public RecycleViewScheduleAdapter(Context c, List<GameSchedule> gameSchedule){
        this.gameSchedule = (ArrayList<GameSchedule>) gameSchedule;
        this.context=c;
    }
    //initialize holder
    @Override
    public RecycleViewScheduleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.game_schedule_cardview,null);
        RecycleViewScheduleHolder scheduleHolder= new RecycleViewScheduleHolder(v);


        return scheduleHolder;
    }

    @Override
    public void onBindViewHolder(RecycleViewScheduleHolder holder, int position) {
        holder.gameNO.setText(gameSchedule.get(position).getGameNo());
        holder.gameTime.setText(gameSchedule.get(position).getGameTime());
        holder.gameDate.setText(gameSchedule.get(position).getGameDate());
        holder.gameDetails.setText(gameSchedule.get(position).getGameDetails());

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
        return gameSchedule.size();
    }
}


