package org.example.practice_5;

public class Dispecher {

    public void starting(Transport transport){
        transport.start();
    }

    public void showInfo(Transport transport){
        System.out.println("скорость" + transport.getSpeed() + " объем: " + transport.getVolume());
    }

}
