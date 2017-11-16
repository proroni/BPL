package com.bpl_t.joy.root.bpl;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.bpl_t.joy.root.bpl.fragment_list.FragmentBplSchedule;
import com.bpl_t.joy.root.bpl.fragment_list.FragmentPlayers;
import com.bpl_t.joy.root.bpl.fragment_list.FragmentScoreBord;
import com.bpl_t.joy.root.bpl.fragment_list.FragmentTeamInfo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    NavigationView navigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_arrow_left_black_24dp);
        actionBar.setDisplayHomeAsUpEnabled(true);


        //actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);   //toolbad vector
        actionBar.setDisplayHomeAsUpEnabled(true);

        //tablayout
        //TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);
        viewPager(viewPager);
        //viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);

        //navigationview
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);
                drawerLayout.closeDrawers();
                Toast.makeText(MainActivity.this, menuItem.getTitle(), Toast.LENGTH_LONG).show();
                return true;
            }
        });

       ImageButton livebuton=(ImageButton)findViewById(R.id.live_button);
        livebuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        LiveMatch.class);
                startActivity(myIntent);

            }
        });
    }

    @Override
        public boolean onOptionsItemSelected (MenuItem item){

            int id = item.getItemId();

            switch (id) {
                case android.R.id.home:
                    drawerLayout.openDrawer(GravityCompat.START);
                    return true;
                case R.id.setting2:
                    return true;
            }
            return super.onOptionsItemSelected(item);
        }







    private void viewPager(ViewPager viewPager) {
        TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentTeamInfo(), "Team info");
        adapter.addFragment(new FragmentScoreBord(), "Score Bord");
        adapter.addFragment(new FragmentBplSchedule(), "Schedule");
        adapter.addFragment(new FragmentPlayers(), "Players");

        viewPager.setAdapter(adapter);



    }

    static class TabAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();


        public TabAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }
        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
           return mFragmentTitleList.get(position);



        }

    }















    }
