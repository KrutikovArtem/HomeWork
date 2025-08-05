package org.example.homeWork_5.aquarium;

public class Main {

    public static void main(String[] args) {

        Starfish starfish = new Starfish();
        Shark shark = new Shark();

        Aquarium aquarium = new Aquarium();

        aquarium.showMove(shark);

        aquarium.setSeaCreature(starfish);

        aquarium.showMove(starfish);
        aquarium.showMove(shark);
    }
}
