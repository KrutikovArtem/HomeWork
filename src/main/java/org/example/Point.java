package org.example;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setX(int newX) {
        this.x = newX;
    }

    int getX() {
        return this.x;
    }

    void print() {
        System.out.println("x= " + x + " y= " + y);
    }
}
