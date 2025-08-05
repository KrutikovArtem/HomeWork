package org.example.homeWork_5.pet;

public class PetManager {
    Pet pet;
    public void setPet(Pet pet){
        this.pet=pet;
    }

    public void handlePet(Pet pet){
        pet.interact();
        pet.feed();
    }
}
