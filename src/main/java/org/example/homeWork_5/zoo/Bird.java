package org.example.homeWork_5.zoo;

public class Bird extends Animal{

    @Override
    public void move(){
        System.out.println("Птица летит");
    }

    @Override
    public void makeSound(){
        System.out.println("Птица чирикает");
    }

}
