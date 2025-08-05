package org.example.homeWork_5.batanicalGarden;

import org.example.homeWork_5.pet.Pet;

public class BotanicalGarden {

    Plant plant;

    public void setPlant(Plant plant){
        this.plant=plant;
    }

    public void showInfo(Plant plant){
        plant.care();
    }
}
