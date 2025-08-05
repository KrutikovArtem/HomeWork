package org.example.homeWork_5.zoo_1;

public class Zoo {


    Animal animal;

    public void setAnimal(Animal animal){
        this.animal=animal;
    }



    public void showAnimalBehavior(Animal animal){
        animal.move();
        animal.makeSound();
    }
}
