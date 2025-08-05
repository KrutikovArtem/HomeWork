package org.example.homeWork_5.zoo;

public abstract class Animal {

    private Animal animal;
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    protected abstract void move();
    protected abstract void makeSound();

}
