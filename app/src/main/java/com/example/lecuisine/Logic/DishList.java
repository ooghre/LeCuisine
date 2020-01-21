package com.example.lecuisine.Logic;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.lecuisine.Domain.Dish;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DishList /*extends ArrayAdapter<Dish>*/ implements Serializable {
    private List<Dish> dishes;


    public DishList(){
        dishes = new ArrayList<>();
    }

    public List<Dish> getDishList() {
        return dishes;
    }

    public void addDish(String dishName){
        Dish dish = new Dish(dishName);
        dishes.add(dish);
    }

    public void deleteDish(int pos){
        dishes.remove(pos);
    }


}
