package org.example;

public class Circle {
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    void setRadius(double newRadius){
        this.radius=newRadius;
    }
    double getRadius(){
        return this.radius;
    }
    void calculateArea(){
        double area= 3.14 * radius * radius;
        System.out.println("Площадь окружности: " + area);
    }
    void calculateCircumference(){
        double circumference = 3.14 * radius / 2;
        System.out.println("Длина окружности: " + circumference);
    }
}
