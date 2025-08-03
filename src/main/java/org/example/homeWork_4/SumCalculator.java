package org.example.homeWork_4;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        SumCalculator.sumCalculator();
    }


    public static void sumCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int sum = 0;
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        System.out.println("Сумма всех чисел = " + sum);
    }
}
