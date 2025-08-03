package org.example.homeWork_4;

import java.util.Scanner;

public class TestScoreEvaluator {
    public static void main(String[] args) {
        TestScoreEvaluator.checkScore();
    }

    public static void checkScore() {
        System.out.print("Введите ваш балл: ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score > 100) {
            System.out.println("Такого бала не существует, введите корректное значение");
        } else if (score >= 90) {
            System.out.println("-Отлично");
        } else if (score >= 75 && score < 90) {
            System.out.println("-Хорошо");
        } else if (score >= 60 && score < 75) {
            System.out.println("-Удовлетворительно");
        } else if (score < 60 && score >= 0) {
            System.out.println("-Неудовлетворительно");
        } else System.out.println("Такого бала не существует, введите корректное значение");
    }
}
