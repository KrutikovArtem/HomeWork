package org.example.homeWork_4;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        factorialCalculator();
    }


    public static void factorialCalculator() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вветите число: ");
        int n = scanner.nextInt();
        int i = 1;
        int sum = 1;

        while (i <= n) {
            sum*=i;
            i++;

        }
        System.out.println(sum);
    }
}
