package org.example.homeWork_5.zoo;

public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Bird bird = new Bird();

        Zoo zoo = new Zoo();

        zoo.showAnimalBehavior(elephant);

        zoo.setAnimal(elephant);
        zoo.setAnimal(bird);
        System.out.println(zoo.animal);

    }
}
