package org.example.homeWork_4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable.multiplicationTable();
    }

    public static void multiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int sum = 1;
        for (int i = 1; i <= 10; i++) {
            sum = i * n;
            System.out.println(i + " * " + n + " = " + sum);
        }
    }
}
