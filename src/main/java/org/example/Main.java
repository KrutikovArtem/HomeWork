package org.example;

import org.example.firstJavaClassAndObject.*;
import org.example.firstJavaProgram.MathOperations;

public class Main {
    public static void main(String[] args) {

        //Первая Java программа
        System.out.println(MathOperations.add(5, 5));
        System.out.println(MathOperations.subtract(25, 5));
        System.out.println(MathOperations.multiply(10, 10));
        System.out.println(MathOperations.divide(50, 5));
        System.out.println(MathOperations.findMax(8, 5));
        System.out.println(MathOperations.difference(117, 100));
        System.out.println(MathOperations.squareArea(5));
        System.out.println(MathOperations.squarePerimeter(80));
        System.out.println(MathOperations.convertSecondsToMinutes(100));
        System.out.println(MathOperations.averageSpeed(5.4, 700));
        System.out.println(MathOperations.findHypotenuse(4, 3));
        System.out.println(MathOperations.circleCircumference(7));
        System.out.println(MathOperations.calculatePercentage(8.8, 7));
        System.out.println(MathOperations.celsiusToFahrenheit(400));
        System.out.println(MathOperations.fahrenheitToCelsius(200.4));

        //Первое создание классов и объектов
        Car car1 = new Car("Лада", 2005);
        car1.setYear(2010);
        car1.print();

        Rectangle rectangle1 = new Rectangle(7.7,5.6);
        rectangle1.setWidth(10);
        rectangle1.calculateArea();

        Book book1 = new Book("Золотая рыбка", "Крутиков");
        book1.setAuthor("Пушкин");
        book1.print();

        BankAccount bankAccount1 = new BankAccount("Artem",500);
        bankAccount1.deposit(1000);
        bankAccount1.withdraw(300);
        bankAccount1.printBalance();

        Point point1 = new Point(8,10);
        point1.setX(45);
        point1.print();

        StudentGroup studentGroup1 = new StudentGroup("Волки",100);
        studentGroup1.setStudentCount(88);
        studentGroup1.printInfo();

        Circle circle1 = new Circle(5.5);
        circle1.setRadius(10.7);
        circle1.calculateArea();
        circle1.calculateCircumference();

        Teacher teacher1 = new Teacher("Петров", "физра");
        teacher1.setSubject("Русский язык");
        teacher1.printInfo();

        Product product1 = new Product("moloko",200);
        product1.applyDiscount(50);
        product1.printInfo();

        Laptop laptop1 = new Laptop("Asus", 100000);
        laptop1.setPrice(80000);
        laptop1.printInfo();


    }
}