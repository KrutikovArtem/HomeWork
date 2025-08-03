package org.example.homeWork_4;

import java.util.Scanner;

public class AgeDiscountCalculator {

    public static void main(String[] args) {
        AgeDiscountCalculator.checkAge();
    }

    public static void checkAge(){
        System.out.print("Введите ваш возраст: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age < 18){
            System.out.println("Ваша скидка 25%");
        }else if (age >= 65){
            System.out.println("Ваша скидка 30%");
        }else System.out.println("Скидка вам не пологается");
    }
}
