package org.example.homeWork_5.attraction;

public class AmusementPark {

    Attraction attraction;

    public void setAttraction(Attraction attraction){
        this.attraction=attraction;
    }

    public void operateAttraction(Attraction attraction){
        attraction.maintain();
    }

}
