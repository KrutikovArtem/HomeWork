package org.example.homeWork_5.attraction;

public class Carousel implements Attraction{

    @Override
    public String info() {
        return "Спокойный аттракцион";
    }

    @Override
    public void maintain() {
        System.out.println("Тех.обслуживание");
    }
}
