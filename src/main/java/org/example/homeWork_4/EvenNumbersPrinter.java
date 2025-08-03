package org.example.homeWork_4;

import java.util.Scanner;

public class EvenNumbersPrinter {
    public static void main(String[] args) {
        evenNumbersPrinter();
    }

    public static void evenNumbersPrinter(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int i = 1;

        while (i <= n){
            if(i % 2 == 0){
                System.out.println(i);
            }i++;
        }
    }
}
