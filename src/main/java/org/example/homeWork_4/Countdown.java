package org.example.homeWork_4;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        countdown();
    }

    public static void countdown(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int i = 1;


        while (n >=i){
            System.out.println(n);
            n--;
        }
    }
}
