package org.example.practice_5;

public class Main {

    public static void main(String[] args) {
        Transport car = new Car();
        Dispecher dispecher = new Dispecher();
        dispecher.starting(car);
        dispecher.showInfo(car);
    }


}
