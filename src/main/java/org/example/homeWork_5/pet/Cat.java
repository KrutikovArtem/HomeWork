package org.example.homeWork_5.pet;

public class Cat implements Pet{
    @Override
    public void feed() {
        System.out.println("Кошка кушает влажный корм");
    }

    @Override
    public void interact() {
        System.out.println("Кошка играет");
    }
}
