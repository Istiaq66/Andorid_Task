package com.istiaq66.andoridtask.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.istiaq66.andoridtask.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import java.util.ArrayList;
import java.util.List;

public class Onboarding extends AppCompatActivity {

    List<Item> items = new ArrayList<>();
    ImageView img1,img2,img3;
    TextView textView;
    DotsIndicator dotsIndicator;


    private  Onboarding_adapter onboarding_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

      /*  img1 = findViewById(R.id.imageView2);
        img2 = findViewById(R.id.imageView3);
        img3 = findViewById(R.id.imageView4);*/

        textView = findViewById(R.id.txt1);
        dotsIndicator = findViewById(R.id.dots_indicator);


        setOnboarding_Items();


        ViewPager2 onboardingviewpager = findViewById(R.id.viewpager);
        onboardingviewpager.setAdapter(onboarding_adapter);
        dotsIndicator.attachTo(onboardingviewpager);


      /*  String inditext = textView.getText().toString();
        setcurrentIndicator(inditext);*/

    }

    private void setOnboarding_Items(){


        Item page1 = new Item();
        page1.setTxt1("Welcome to");
        page1.setTxt2("Applicaion");
        page1.setImage1(R.drawable.ubaz);
        page1.setImage2(R.drawable.basket);

        items.add(page1);

        Item page2 = new Item();
        page2.setTxt1("Get");
        page2.setTxt2("Delivery Service");
        page2.setImage1(R.drawable.fast);
        page2.setImage2(R.drawable.bike);

        items.add(page2);

        Item page3 = new Item();
        page3.setTxt1("Best Quality");
        page3.setTxt2("Door to Door");
        page3.setImage1(R.drawable.grocery);
        page3.setImage2(R.drawable.troly);

        items.add(page3);

        onboarding_adapter = new Onboarding_adapter(items);

    }

    public void setcurrentIndicator(String status){




       /* if(status=="Welcome to"){
            img1.setImageResource(R.drawable.indicator_active);
            img2.setImageResource(R.drawable.incative_indicator);
            img3.setImageResource(R.drawable.incative_indicator);
        }
        else if(status=="Get"){
            img2.setImageResource(R.drawable.indicator_active);
            img1.setImageResource(R.drawable.incative_indicator);
            img3.setImageResource(R.drawable.incative_indicator);
        }
        else if(status=="Best Quality"){
            img3.setImageResource(R.drawable.indicator_active);
            img2.setImageResource(R.drawable.incative_indicator);
            img1.setImageResource(R.drawable.incative_indicator);
        }*/


    }
}