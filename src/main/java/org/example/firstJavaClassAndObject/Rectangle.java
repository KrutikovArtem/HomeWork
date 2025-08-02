package org.example.firstJavaClassAndObject;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public void calculateArea(){
        System.out.println(this.width * this.height);
    }
}
