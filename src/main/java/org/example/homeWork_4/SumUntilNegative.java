package org.example.homeWork_4;

import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        negativ();
    }


    public static void negativ() {

        Scanner scanner = new Scanner(System.in);
        int scan;
        int sum = 0;

        while (true) {
            System.out.println("Введите число: ");
            scan = scanner.nextInt();
            sum += scan;
            if (scan <= 0) {
                break;
            }


        }
        System.out.println(sum);

    }
}

