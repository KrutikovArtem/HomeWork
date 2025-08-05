package org.example.homeWork_5.farmAnimal;

public class Main {
    public static void main(String[] args) {

        Cow cow = new Cow();
        Chicken chicken = new Chicken();

        Farm farm = new Farm();

        farm.setFarmAnimal(cow);

        farm.serviceAnimal(cow);
        farm.serviceAnimal(chicken);
    }
}
