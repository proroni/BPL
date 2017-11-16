package com.bpl_t.joy.root.bpl;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by root on 10/29/17.
 */

public class Login extends AppCompatActivity {
    Button login,crtAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen_layout);


        login=(Button) findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Login.this,
                        MainActivity.class);
                startActivity(myIntent);

            }
        });
        crtAccount=(Button) findViewById(R.id.button_create_accoutn);
        crtAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Login.this,
                        CreateAccount.class);
                startActivity(myIntent);

            }
        });

    }
}

