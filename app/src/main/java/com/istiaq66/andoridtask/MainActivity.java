package com.istiaq66.andoridtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.istiaq66.andoridtask.Api.Data_fetch;
import com.istiaq66.andoridtask.Ui.Ui_part;

public class MainActivity extends AppCompatActivity {

    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);



        //----------Api part show-----------//
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Data_fetch.class);
                startActivity(intent);
            }
        });
        //----------Api part show-----------//




        //----------UI part show-----------//
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Ui_part.class);
                startActivity(intent);
            }
        });
        //----------UI part show-----------//


    }
}