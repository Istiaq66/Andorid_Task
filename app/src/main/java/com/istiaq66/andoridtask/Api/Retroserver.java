package com.istiaq66.andoridtask.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retroserver {

    private static final String BASE_URL="https://pqstec.com/invoiceapps/Values/";

    private static Retrofit retrofit;

    public static Retrofit getClient() {

        if (retrofit == null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }

        return retrofit;


    }


}
