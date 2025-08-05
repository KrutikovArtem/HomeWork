package org.example.homeWork_5.dish;

public class Drink implements Dish {

    private int volume = 5;

    public String getDescription() {
        String info = "Объем напитка: ";
        String s = String.valueOf(volume);
        return info + s;

    }
}
