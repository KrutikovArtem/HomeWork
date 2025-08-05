package org.example.homeWork_5.farmAnimal;

public class Farm {

    FarmAnimal farmAnimal;

    public void setFarmAnimal(FarmAnimal farmAnimal){
        this.farmAnimal=farmAnimal;
    }

    public void serviceAnimal(FarmAnimal farmAnimal){
        farmAnimal.care();
        farmAnimal.feed();
        farmAnimal.produce();
    }
}
