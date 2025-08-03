package org.example.homeWork_4;

import java.util.Scanner;

public class GradeConverter {

    public static void main(String[] args) {
        GradeConverter.converter();
    }

    public static void converter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш балл: ");
        int score = scanner.nextInt();
        switch (score / 10){
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }
}
