package com.istiaq66.andoridtask.Api;

import java.util.ArrayList;

public class Product {
  private String Success,error;
  private ArrayList<Model> ProductList;

    public Product(String success, String error, ArrayList<Model> productList) {
        this.Success = success;
        this.error = error;
        this.ProductList = productList;
    }

    public String getSuccess() {
        return Success;
    }

    public void setSuccess(String success) {
        Success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public ArrayList<Model> getProductList() {
        return ProductList;
    }

    public void setProductList(ArrayList<Model> productList) {
        ProductList = productList;
    }
}
