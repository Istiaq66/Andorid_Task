package com.istiaq66.andoridtask.Api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.istiaq66.andoridtask.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Data_fetch extends AppCompatActivity {


    List<Model> productList;
    Adapter adapter;
    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_fetch);

        //initializing the productlist
        productList = new ArrayList<>();


        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.review);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(Data_fetch.this,productList);
        recyclerView.setAdapter(adapter);


        myapi api = Retroserver.getClient().create(myapi.class);
        Call<Product> getData = api.getpro("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySWQiOiI3OCIsIkN1cnJlbnRDb21JZCI6IjEiLCJuYmYiOjE2NzMwODIyMDIsImV4cCI6MTY3MzY4NzAwMiwiaWF0IjoxNjczMDgyMjAyfQ.2WggDbI43qFqNf8rT7Pb3dR_ihv2TU3E8joZhjOCx8I");

        getData.enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {

                if(response.isSuccessful()){

                    productList.addAll(response.body().getProductList());
                    adapter.notifyDataSetChanged();
                }
                else {
                    Toast.makeText(Data_fetch.this, "Error", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {

                Log.d("RETRO", "RESPONSE : " + t.getLocalizedMessage());
            }
        });
    }
}