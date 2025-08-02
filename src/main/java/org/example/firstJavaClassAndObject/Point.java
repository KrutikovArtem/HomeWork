package org.example.firstJavaClassAndObject;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public int getX() {
        return this.x;
    }

    public void print() {
        System.out.println("x= " + x + " y= " + y);
    }
}
