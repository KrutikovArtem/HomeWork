package org.example.homeWork_4;

import java.util.Scanner;

public class ParityChecker {
    public static void main(String[] args) {
        ParityChecker.checkParity();
    }

    public static void checkParity() {

        System.out.print("Введите целове число: ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score % 2 == 0){
            System.out.println(score + " - Число четное");
        }else System.out.println(score + " - Число нечетное");
    }
}
