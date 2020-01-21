package com.example.lecuisine.Domain;

import java.io.Serializable;

public class Dish implements Serializable {
    private String name;

    public Dish(String theName){
        name = theName;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        //maybe add more stuff later?
        return name;
    }
}
