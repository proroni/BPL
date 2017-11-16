package com.bpl_t.joy.root.bpl.fragment_list;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bpl_t.joy.root.bpl.Database.DatabaseHandler;
import com.bpl_t.joy.root.bpl.PlayerData;
import com.bpl_t.joy.root.bpl.R;
import com.bpl_t.joy.root.bpl.Recycler.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 10/7/17.
 */

public class FragmentPlayers extends Fragment {


    public List<PlayerData>playerlist=new ArrayList<>();



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_players, container, false);


        //recyclerview

        RecyclerView rv =rootView.findViewById(R.id.player_recyclerview);

        rv.setHasFixedSize(true);

        LinearLayoutManager llm =new LinearLayoutManager(this.getActivity());

        //problem 1
        rv.setLayoutManager(llm);
        RecyclerAdapter adapter = new RecyclerAdapter(this.getActivity(),getPlayerDataList());
        rv.setAdapter(adapter);









        return rootView;
    }

    private List<PlayerData> getPlayerDataList() {
        ArrayList<PlayerData>players=new ArrayList<>();
        players.add(new PlayerData("Emma ", "23 years old", R.drawable.bpl_logo));
        players.add(new PlayerData("Lavery Maiss", "25 years old", R.drawable.bpl_logo));
        players.add(new PlayerData(" Watts", "35 years old", R.drawable.barisal));
        players.add(new PlayerData("Emma ", "23 years old", R.drawable.bpl_logo));
        players.add(new PlayerData("Lavery Maiss", "25 years old", R.drawable.bpl_logo));
        players.add(new PlayerData("Lillie Watts", "35 years old", R.drawable.barisal));
        players.add(new PlayerData("Emma Wilson", "23 years old", R.drawable.bpl_logo));
        players.add(new PlayerData("Lavery Maiss", "25 years old", R.drawable.bpl_logo));
        players.add(new PlayerData("Lillie Watts", "35 years old", R.drawable.barisal));
        players.add(new PlayerData("Emma Wilson", "23 years old", R.drawable.bpl_logo));
        players.add(new PlayerData("Lavery Maiss", "25 years old", R.drawable.bpl_logo));
        players.add(new PlayerData("Lillie Watts", "35 years old", R.drawable.barisal));
        players.add(new PlayerData("Emma Wilson", "23 years old", R.drawable.bpl_logo));
        players.add(new PlayerData("Lavery Maiss", "25 years old", R.drawable.bpl_logo));
        players.add(new PlayerData("Lillie Watts", "35 years old", R.drawable.barisal));
        return players;
    }

    }

    /*  public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{
          List<PlayerData> players;
  
  
  
          public  class PersonViewHolder extends RecyclerView.ViewHolder {
              CardView cv;
              TextView personName;
              TextView personAge;
              ImageView personPhoto;
  
              PersonViewHolder(View itemView) {
                  super(itemView);
                  cv = (CardView)itemView.findViewById(R.id.cv);
                  personName = (TextView)itemView.findViewById(R.id.person_name);
                  personAge = (TextView)itemView.findViewById(R.id.person_age);
                  personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
              }
  
          }
  
          RVAdapter(List<PlayerData>playerList){
              this.players =playerList ;
          }
  
          @Override
          public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
              View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.players_info_cardview, viewGroup, false);
              PersonViewHolder pvh = new PersonViewHolder(v);
              return pvh;
          }
  
          @Override
          public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
              PlayerData playerData =players.get(i);
              personViewHolder.personName.setText(playerData.name);
              personViewHolder.personAge.setText(playerData.age);
              personViewHolder.personPhoto.setImageResource(playerData.photoId);
          }
  
          @Override
          public int getItemCount() {
              return players.size();
  
  
          }
  
          @Override
          public void onAttachedToRecyclerView(RecyclerView recyclerView) {
              super.onAttachedToRecyclerView(recyclerView);
          }
  
  
      }
  
  */
    /*public void initializeData() {
        List<PlayerData>players = new ArrayList<>();
        players.add(new PlayerData("Emma Wilson", "23 years old", R.drawable.bpl_logo));
        players.add(new PlayerData("Lavery Maiss", "25 years old", R.drawable.bpl_logo));
        players.add(new PlayerData("Lillie Watts", "35 years old", R.drawable.bpl_logo));
    }
*/











