package com.example.lephuocthanh_19dh110744;

import android.app.Application;
import android.content.Context;

import java.util.ArrayList;

public class App extends Application {
    @Override
    public void onCreate()
    {
        super.onCreate();
    }

    public static ArrayList<Furniture> init(Context context ){
        ArrayList<Furniture> tmp = new ArrayList<>();
        tmp.add(new Furniture(context.getString(R.string.name_product_one),
                context.getString(R.string.product_one),
                R.drawable.hinh_1,1 ,1));
        tmp.add(new Furniture(context.getString(R.string.name_product_tow),
                context.getString(R.string.product_tow),
                R.drawable.hinh_2,1,1));
        tmp.add(new Furniture(context.getString(R.string.name_product_three),
                context.getString(R.string.product_three),
                R.drawable.hinh_3,1,1));
        tmp.add(new Furniture(context.getString(R.string.name_product_four),
                context.getString(R.string.product_four),
                R.drawable.hinh_4,1,1));
        tmp.add(new Furniture(context.getString(R.string.name_product_five),
                context.getString(R.string.product_five),
                R.drawable.hinh_5,1,1));
        tmp.add(new Furniture(context.getString(R.string.name_product_one),
                context.getString(R.string.product_one),
                R.drawable.hinh_1,2,2 ));
        tmp.add(new Furniture(context.getString(R.string.name_product_tow),
                context.getString(R.string.product_tow),
                R.drawable.hinh_2,2 ,2 ));
        tmp.add(new Furniture(context.getString(R.string.name_product_three),
                context.getString(R.string.product_three),
                R.drawable.hinh_3,2,2));
        tmp.add(new Furniture(context.getString(R.string.name_product_four),
                context.getString(R.string.product_four),
                R.drawable.hinh_4,2,2));
        tmp.add(new Furniture(context.getString(R.string.name_product_five),
                context.getString(R.string.product_five),
                R.drawable.hinh_5,2,2));
        tmp.add(new Furniture(context.getString(R.string.name_product_one),
                context.getString(R.string.product_one),
                R.drawable.hinh_1,3,3));
        tmp.add(new Furniture(context.getString(R.string.name_product_tow),
                context.getString(R.string.product_tow),
                R.drawable.hinh_2,3 ,3 ));
        tmp.add(new Furniture(context.getString(R.string.name_product_three),
                context.getString(R.string.product_three),
                R.drawable.hinh_3,3,3));
        tmp.add(new Furniture(context.getString(R.string.name_product_four),
                context.getString(R.string.product_four),
                R.drawable.hinh_4,3,3));
        tmp.add(new Furniture(context.getString(R.string.name_product_five),
                context.getString(R.string.product_five),
                R.drawable.hinh_5,3,3));

        return tmp;
    }
    public static ArrayList<Categories> init() {

        ArrayList<Categories> tmp=new ArrayList<>() ;
        tmp.add(new Categories(R.drawable.bed_room,"Bed room",1));
        tmp.add(new Categories(R.drawable.living_room,"Living_room",2));
        tmp.add(new Categories(R.drawable.accessories,"Accessories",3));
        tmp.add(new Categories(R.drawable.meeting_room,"Metting room",4));
        return tmp;
    }


}
