package com.istiaq66.andoridtask.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.istiaq66.andoridtask.R;

public class Ui_part extends AppCompatActivity {


    private  static int SPLASH_TIME_OUT = 2500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_part);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Ui_part.this,Onboarding.class);
                startActivity(intent);
            }
        },SPLASH_TIME_OUT);
        
    }
}