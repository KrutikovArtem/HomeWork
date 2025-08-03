package org.example.homeWork_4;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        count();
    }


    public static void count(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int scan = scanner.nextInt();
        int i = 1;

        do {
            if(scan / 10 != 0){
                i++;
                scan = scan /10;
            }
        }while (scan / 10 != 0);
        System.out.println(i);
    }
}
