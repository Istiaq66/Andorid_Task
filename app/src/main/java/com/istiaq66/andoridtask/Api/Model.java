package com.istiaq66.andoridtask.Api;

import java.util.ArrayList;

public class Model {
   private String CategoryName,UnitName,Name,Code,ProductBarcode;

    public Model(String categoryName, String unitName, String name, String code, String productBarcode) {
        CategoryName = categoryName;
        UnitName = unitName;
        Name = name;
        Code = code;
        ProductBarcode = productBarcode;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getProductBarcode() {
        return ProductBarcode;
    }

    public void setProductBarcode(String productBarcode) {
        ProductBarcode = productBarcode;
    }
}
