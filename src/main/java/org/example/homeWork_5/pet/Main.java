package org.example.homeWork_5.pet;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        PetManager petManager = new PetManager();
        petManager.handlePet(cat);
        petManager.setPet(dog);

    }
}
