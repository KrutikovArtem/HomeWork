package org.example.homeWork_5.aquarium;

public class Aquarium {

    SeaCreature seaCreature;

    public void setSeaCreature(SeaCreature seaCreature){
        this.seaCreature=seaCreature;
    }

    public void showMove(SeaCreature seaCreature){
       seaCreature.move();
    }
}
