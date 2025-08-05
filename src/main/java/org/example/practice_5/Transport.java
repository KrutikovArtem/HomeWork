package org.example.practice_5;

public abstract class Transport {

    public Transport(int speed, int volume) {
        this.speed = speed;
        this.volume = volume;
    }

    private int speed;
    private int volume;

    public int getSpeed() {
        return speed;
    }

    public int getVolume() {
        return volume;
    }

    abstract  void start();
}
