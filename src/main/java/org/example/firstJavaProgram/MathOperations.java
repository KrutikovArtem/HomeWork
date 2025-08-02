package org.example.firstJavaProgram;

public class MathOperations {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return x / (double) y;
    }


    public static int findMax(int x, int y) {
        return Math.max(x, y);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int x) {
        return x * x;
    }

    public static int squarePerimeter(int x) {
        return 4 * x;
    }

    public static double convertSecondsToMinutes(int second) {
        return second / 60.0;
    }

    public static double averageSpeed(double time, double distance) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double r) {
        final double PI = 3.14;
        return 2 * PI * r;
    }

    public static double calculatePercentage(double total, double part) {
        return part / total * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }


}
