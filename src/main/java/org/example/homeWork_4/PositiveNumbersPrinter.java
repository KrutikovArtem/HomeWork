package org.example.homeWork_4;

import java.util.Scanner;

public class PositiveNumbersPrinter {
    public static void main(String[] args) {
        pos();
    }


    public static void pos() {

        Scanner scanner = new Scanner(System.in);
        int scan;

        while (true) {
            System.out.println("Ввидите число: ");
            scan = scanner.nextInt();
            if (scan < 0){
                continue;
            }else System.out.println(scan);
        }
    }
}
