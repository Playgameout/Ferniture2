package com.example.lephuocthanh_19dh110744;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Furniture {
    String name;
    String des;
    int image;
    int idCategories;
    int idFurniture;


    public Furniture(String name, String des, int image, int idCategories, int idFurniture) {
        this.name = name;
        this.des = des;
        this.image = image;
        this.idCategories = idCategories;
        this.idFurniture = idFurniture;
    }

    public Furniture(String name, String des, int image) {
        this.name = name;
        this.des = des;
        this.image = image;
    }
    //create form data


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture = (Furniture) o;
        return image == furniture.image && idCategories == furniture.idCategories && name.equals(furniture.name) && des.equals(furniture.des);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, des, image, idCategories,idFurniture);
    }

}
