package org.example.homeWork_5.farmAnimal;

public class Chicken implements FarmAnimal{
    @Override
    public void feed() {
        System.out.println("Есть зерно");
    }

    @Override
    public void care() {
        System.out.println("Нужна поилка");
    }

    @Override
    public void produce() {
        System.out.println("Дает яйцо");
    }
}
