package org.example.homeWork_5.pet;

public class Dog implements Pet{
    @Override
    public void feed(){
        System.out.println("Собака кушает сухой корм");
    }
    @Override
    public void interact(){
        System.out.println("Собака гуляет");
    }
}
