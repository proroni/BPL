package com.bpl_t.joy.root.bpl;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by root on 10/29/17.
 */

public class LauncherScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luncher_screen_layout);

        Button btn= (Button) findViewById(R.id.lets_play_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(LauncherScreen.this,
                        Login.class);
                startActivity(myIntent);

            }
        });
    }
    }


