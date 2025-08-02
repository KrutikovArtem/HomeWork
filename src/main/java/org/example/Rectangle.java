package org.example;

public class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    double getWidth(){
        return this.width;
    }
    double getHeight(){
        return this.height;
    }

    void setWidth(double width){
        this.width=width;
    }

    void calculateArea(){
        System.out.println(this.width * this.height);
    }
}
