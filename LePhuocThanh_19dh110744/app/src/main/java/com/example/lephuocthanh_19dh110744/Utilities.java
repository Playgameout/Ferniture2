package com.example.lephuocthanh_19dh110744;

import java.util.ArrayList;

public class Utilities {
    public static ArrayList<Furniture> data;
    public static ArrayList<Furniture> dataHomFromCate;
    public Utilities(){
    }
    public static ArrayList<Furniture> getInstance()
    {
        if(data==null){
            data=new ArrayList<>();
        }
        return data;

    }
    public static ArrayList<Furniture> getInstanceFromCate()
    {
        if(dataHomFromCate==null){
            dataHomFromCate=new ArrayList<>();
        }
        return dataHomFromCate;

    }

}
