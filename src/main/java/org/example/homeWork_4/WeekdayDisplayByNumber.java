package org.example.homeWork_4;

import org.example.practice_4.WhileTaskSolver;

import java.util.Scanner;

public class WeekdayDisplayByNumber {
    public static void main(String[] args) {
        WeekdayDisplayByNumber.checkWeek();
    }

    public static void checkWeek(){

        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int week = scanner.nextInt();
        switch (week){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
            default:
                System.out.println("Такого дня недели не существует");
        }
    }
}
