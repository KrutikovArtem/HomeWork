package org.example.homeWork_5.exhibit;

public class Sculpture extends Exhibit {

    @Override
    public String describe() {
        return "Скульптурный объект";
    }

    @Override
    public void preserve() {
        System.out.println("Реставрация");
    }
}
