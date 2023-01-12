package com.istiaq66.andoridtask.Api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface myapi
{



    @GET("GetProductList")
    Call<Product> getpro(@Header("Authorization") String authorization);

}
