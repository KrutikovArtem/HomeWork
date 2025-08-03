package org.example.homeWork_4;

import java.util.Scanner;

public class PositiveNumberInput {
    public static void main(String[] args) {
        positiveNumberInput();
    }

    public static void positiveNumberInput() {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Введите положительное число: ");
            n = scanner.nextInt();

        } while (n <= 0);
    }
}
