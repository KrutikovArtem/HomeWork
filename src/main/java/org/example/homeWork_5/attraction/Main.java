package org.example.homeWork_5.attraction;

public class Main {
    public static void main(String[] args) {

        AmusementPark amusementPark = new AmusementPark();
        RollerCoaster rollerCoaster = new RollerCoaster();
        Carousel carousel = new Carousel();

        amusementPark.setAttraction(rollerCoaster);

        amusementPark.operateAttraction(rollerCoaster);
        amusementPark.operateAttraction(carousel);
    }
}
