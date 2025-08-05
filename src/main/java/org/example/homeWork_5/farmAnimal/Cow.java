package org.example.homeWork_5.farmAnimal;

public class Cow implements FarmAnimal{
    @Override
    public void feed() {
        System.out.println("Есть траву");
    }

    @Override
    public void care() {
        System.out.println("Выпас");
    }

    @Override
    public void produce() {
        System.out.println("Дает молоко");
    }
}
