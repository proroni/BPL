package com.bpl_t.joy.root.bpl.RecycleviewShedule;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import android.widget.TextView;

import com.bpl_t.joy.root.bpl.R;
import com.bpl_t.joy.root.bpl.Recycler.iteamClickListner;

/**
 * Created by root on 10/28/17.
 */

public class RecycleViewScheduleHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView gameTime;
    TextView gameDate;
    TextView gameDetails;
    TextView gameNO;
    iteamClickListner iteamClickListner;
    com.bpl_t.joy.root.bpl.Recycler.iteamClickListner onItemClick;



    public RecycleViewScheduleHolder(View itemView) {
        super(itemView);
        gameNO=(TextView)itemView.findViewById(R.id.game_no);
        gameTime = (TextView)itemView.findViewById(R.id.game_time);
        gameDate = (TextView)itemView.findViewById(R.id.game_date);
        gameDetails = (TextView) itemView.findViewById (R.id.game_details);
        itemView.setOnClickListener(this);
    }
    public void iteamClickListner(iteamClickListner ic){
        this.iteamClickListner=ic;
    }
    @Override
    public void onClick(View v) {
        this.iteamClickListner.onItemClick(v,getLayoutPosition());

    }
}
