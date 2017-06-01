package com.example.freshield.listviewtest;

/**
 * Created by freshield on 31/05/17.
 */

public class Fruit {

    private String name;

    private int imageId;

    public Fruit(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
