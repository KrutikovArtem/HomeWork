package org.example.homeWork_5.dish;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    Dish dish;

    public void printMenu(Dish dish){
        System.out.println(dish.getDescription());
    }

    List<Dish> dishs = new ArrayList<>();
    public void setDish(Dish dish){
        this.dish=dish;
    }
}
