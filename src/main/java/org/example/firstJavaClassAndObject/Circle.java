package org.example.firstJavaClassAndObject;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public void setRadius(double newRadius){
        this.radius=newRadius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void calculateArea(){
        double area= 3.14 * radius * radius;
        System.out.println("Площадь окружности: " + area);
    }
    public void calculateCircumference(){
        double circumference = 3.14 * radius / 2;
        System.out.println("Длина окружности: " + circumference);
    }
}
