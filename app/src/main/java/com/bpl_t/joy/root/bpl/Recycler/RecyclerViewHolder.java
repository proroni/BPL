package com.bpl_t.joy.root.bpl.Recycler;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bpl_t.joy.root.bpl.R;

/**
 * Created by root on 10/21/17.
 */

public class RecyclerViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView personName;
    TextView personAge;
    ImageView personPhoto;
    iteamClickListner iteamClickListner;
    com.bpl_t.joy.root.bpl.Recycler.iteamClickListner onItemClick;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        personName = (TextView)itemView.findViewById(R.id.person_name);
        personAge = (TextView)itemView.findViewById(R.id.person_age);
        personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
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
