package org.example;

public class MathConstants {
    final static double PI = 3.14159;
    final double E = 2.71828;

    static double calculateCircleArea(double radius){
        return PI * radius *radius;
    }

    static double calculateCircumference(double radius){
        return 2 * PI * radius;
    }
}
