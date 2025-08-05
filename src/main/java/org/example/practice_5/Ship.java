package org.example.practice_5;

public class Ship extends Transport {
    public Ship() {
        super(30,100000);
    }

    @Override
    void start() {
        System.out.println("поплыли");
    }
}
