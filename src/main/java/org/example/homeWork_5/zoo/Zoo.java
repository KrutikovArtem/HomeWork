package org.example.homeWork_5.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animals = new ArrayList<>();
    Animal animal;
    public void setAnimal(Animal animal){
        this.animal=animal;
    }
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void showAnimalBehavior(Animal animal){
        animal.move();
        animal.makeSound();

    }
}

