package com.bpl_t.joy.root.bpl.fragment_list;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bpl_t.joy.root.bpl.PlayerData;
import com.bpl_t.joy.root.bpl.R;
import com.bpl_t.joy.root.bpl.Recycler.RecyclerAdapter;
import com.bpl_t.joy.root.bpl.RecycleviewShedule.GameSchedule;
import com.bpl_t.joy.root.bpl.RecycleviewShedule.RecycleViewScheduleAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 10/7/17.
 */

public class FragmentBplSchedule extends Fragment {
    public List<GameSchedule>gameSchedule=new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_bpl_schedule, container, false);



        //recyclerview

        RecyclerView rv =rootView.findViewById(R.id.schedule_recyclerview);

        rv.setHasFixedSize(true);

        LinearLayoutManager llm =new LinearLayoutManager(this.getActivity());

        //problem 1
        rv.setLayoutManager(llm);
        RecycleViewScheduleAdapter adapter = new RecycleViewScheduleAdapter(this.getActivity(),getGameDetailsList());
        rv.setAdapter(adapter);











       return rootView;
    }

    private List<GameSchedule> getGameDetailsList() {
        ArrayList<GameSchedule> gameDetails=new ArrayList<>();
        gameDetails.add(new GameSchedule("1st Match","Nov 04, Sat ","2:00 PM","Sylhet Sixers vs Dhaka Dynamites, 1st Match\n" +
                "Sylhet International Cricket Stadium, Sylhet"));
        gameDetails.add(new GameSchedule("2nd Match","Nov 04, Sat ","7:00 PM","Rajshahi Kings vs Rangpur Riders, 2nd Match\n" +
                "Sylhet International Cricket Stadium, Sylhet"));
        gameDetails.add(new GameSchedule("3rd Match","Nov 05, Sat ","2:00 PM","Sylhet Sixers vs Comilla Victorians, 3rd Match\n" +
                "Sylhet International Cricket Stadium, Sylhet"));
        gameDetails.add(new GameSchedule("4th Match","Nov 05, Sat ","7:00 PM","Khulna Titans vs Dhaka Dynamites, 4th Match\n" +
                "Sylhet International Cricket Stadium, Sylhet"));
        gameDetails.add(new GameSchedule("5th Match","Nov 07, Sat ","2:00 PM","Chittagong Vikings vs Comilla Victorians, 5th Match\n" +
                "Sylhet International Cricket Stadium, Sylhet"));
        gameDetails.add(new GameSchedule("6th Match","Nov 07, Sat ","7:00 PM","Sylhet Sixers vs Rajshahi Kings, 6th Match\n" +
                "Sylhet International Cricket Stadium, Sylhet"));
        gameDetails.add(new GameSchedule("7th Match","Nov 08, Sat ","2:00 PM","Rangpur Riders vs Chittagong Vikings, 7th Match\n" +
                "Sylhet International Cricket Stadium, Sylhet"));
        gameDetails.add(new GameSchedule("8th Match","Nov 08, Sat ","7:00 PM","Sylhet Sixers vs Khulna Titans, 8th Match\n" +
                "Sylhet International Cricket Stadium, Sylhet"));
        gameDetails.add(new GameSchedule("9th Match","Nov 11, Sat ","2:00 PM","Rangpur Riders vs Rajshahi Kings, 9th Match\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("10th Match","Nov 11, Sat ","7:00 PM","Dhaka Dynamites vs Sylhet Sixers, 10th Match\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("11th Match","Nov 12, Sun ","2:00 PM","Chittagong Vikings vs Khulna Titans, 11th Match\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("12th Match","Nov 12, Sun ","7:00 PM","Rajshahi Kings vs Comilla Victorians, 12th Match\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("13th Match","Nov 14, Tue ","2:00 PM","Dhaka Dynamites vs Khulna Titans, 13rd Match\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("14th Match","Nov 14, Tue ","7:00 PM","Comilla Victorians vs Chittagong Vikings, 14th Match\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("15th Match","Nov 15, Wed ","2:00 PM","Khulna Titans vs Sylhet Sixers, 15th Match\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("16th Match","Nov 15, Wed ","7:00 PM","Dhaka Dynamites vs Chittagong Vikings, 16th Match\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("17th Match","Nov 17, Fri ","2:30 PM","Rajshahi Kings vs Sylhet Sixers,\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("18th Match","Nov 17, Fri ","7:15 PM","Khulna Titans vs Chittagong Vikings,\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("19th Match","Nov 18, Sat ","2:00 PM","Dhaka Dynamites vs Rajshahi Kings,\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("20th Match","Nov 18, Sat ","7:00 PM","Rangpur Riders vs Comilla Victorians,\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("21th Match","Nov 20, Mon ","2:00 PM","Dhaka Dynamites vs Comilla Victorians, \n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("22th Match","Nov 20, Mon ","7:00 PM","Sylhet Sixers vs Rangpur Riders, 22nd Match\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("23th Match","Nov 21, Tue ","2:00 PM","Rajshahi Kings vs Khulna Titans, 23rd Match\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("24th Match","Nov 21, Tue ","7:00 PM","Dhaka Dynamites vs Rangpur Riders, 24th Match\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("25th Match","Nov 24, Fri ","2:00 PM","Khulna Titans vs Rangpur Riders, 25th Match\n" +
                "Zahur Ahmed Chowdhury Stadium, Chittagong"));
        gameDetails.add(new GameSchedule("26th Match","Nov 24, Fri ","7:00 PM","Chittagong Vikings vs Sylhet Sixers, 26th Match\n" +
                "Zahur Ahmed Chowdhury Stadium, Chittagong"));
        gameDetails.add(new GameSchedule("27th Match","Nov 25, Sat ","2:00 PM","Comilla Victorians vs Rajshahi Kings, 27th Match\n" +
                "Zahur Ahmed Chowdhury Stadium, Chittagong"));
        gameDetails.add(new GameSchedule("28th Match","Nov 25, Sat ","7:00 PM","Chittagong Vikings vs Rangpur Riders, 28th Match\n" +
                "Zahur Ahmed Chowdhury Stadium, Chittagong"));
        gameDetails.add(new GameSchedule("29th Match","Nov 27, Mon ","2:00 PM","Chittagong Vikings vs Dhaka Dynamites, 29th Match\n" +
                "Zahur Ahmed Chowdhury Stadium, Chittagong"));
        gameDetails.add(new GameSchedule("30th Match","Nov 27, Mon ","7:00 PM","Khulna Titans vs Rajshahi Kings, 30th Match\n" +
                "Zahur Ahmed Chowdhury Stadium, Chittagong"));
        gameDetails.add(new GameSchedule("31th Match","Nov 28, Tue ","2:00 PM","Rangpur Riders vs Sylhet Sixers, 31st Match\n" +
                "Zahur Ahmed Chowdhury Stadium, Chittagong"));
        gameDetails.add(new GameSchedule("32th Match","Nov 28, Tue ","7:00 PM","Khulna Titans vs Comilla Victorians, 32nd Match\n" +
                "Zahur Ahmed Chowdhury Stadium, Chittagong"));
        gameDetails.add(new GameSchedule("33th Match","Nov 29, Wed ","2:00 PM","Chittagong Vikings vs Rajshahi Kings,\n" +
                "Zahur Ahmed Chowdhury Stadium, Chittagong"));
        gameDetails.add(new GameSchedule("34th Match","Nov 29, Wed ","7:00 PM","Comilla Victorians vs Dhaka Dynamites, \n" +
                "Zahur Ahmed Chowdhury Stadium, Chittagong"));
        gameDetails.add(new GameSchedule("35th Match","Dec 02, Sat ","2:00 PM","Comilla Victorians vs Rangpur Riders, \n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("36th Match","Dec 02, Sat ","7:00 PM","Dhaka Dynamites vs Rajshahi Kings, \n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("37th Match","Dec 03, Sun","2:00 PM","Sylhet Sixers vs Chittagong Vikings, \n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("38th Match","Dec 03, Sun","7:00 PM","Rangpur Riders vs Khulna Titans, \n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("39th Match","Dec 05, Tue ","2:00 PM","Comilla Victorians vs Khulna Titans, \n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("40th Match","Dec 05, Tue ","7:00 PM","Rajshahi Kings vs Chittagong Vikings, \n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("41nd Match Match","Dec 06, Wed ","2:00 PM","Dhaka Dynamites vs Rangpur Riders, \n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("42nd Match","Dec 06, Wed ","7:00 PM","Comilla Victorians vs Sylhet Sixers,\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule(" Eliminator","Dec 08, Fri","2:30 PM ","TBC vs TBC, Eliminator\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("Qualifier 1","Dec 08, Fri ","2:30 PM","TBC vs TBC,\n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("Qualifier 2","Dec 10, Sun","7:00 PM","TBC vs TBC, \n" +
                "Shere Bangla National Stadium, Dhaka"));
        gameDetails.add(new GameSchedule("Final","Dec 12, Tue ","7:00 PM","TBC vs TBC, \n" +
                "Shere Bangla National Stadium, Dhaka"));
        return gameDetails;
    }


}
