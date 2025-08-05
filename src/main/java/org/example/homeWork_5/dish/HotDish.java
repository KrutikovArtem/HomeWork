package org.example.homeWork_5.dish;

public class HotDish implements Dish {

    private int temp = 50;

    public String getDescription() {
        String info = "Температура блюда: ";
        String s = String.valueOf(temp);
        return info + s;

    }
}
