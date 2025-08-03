package org.example.homeWork_4;

import java.util.Scanner;

public class NumberSignDetector {
    public static void main(String[] args) {
        NumberSignDetector.detectedSing();
    }

    public static void detectedSing(){
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number > 0){
            System.out.println("Число положительное");
        }else if(number < 0){
            System.out.println("Число отрицательное");
        }else System.out.println("Число равно 0");
    }
}
