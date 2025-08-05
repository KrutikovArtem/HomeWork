package org.example.homeWork_5.zoo_1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Bird bird = new Bird();
        zoo.showAnimalBehavior(bird);


        System.out.println(zoo.animal);
        zoo.setAnimal(bird);
        System.out.println(zoo.animal);


    }
}
