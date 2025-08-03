package org.example.practice_4;

import static org.example.practice_4.Season.WINTER;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        SwitchTaskSolver.check(1);
        SwitchTaskSolver.check(2);
        SwitchTaskSolver.check(3);
        SwitchTaskSolver.check(4);
        SwitchTaskSolver.check(43);
        System.out.println(SwitchTaskSolver.describeSeason(Season.WINTER));

    }

    static void check(int mon) {
        switch (mon) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:
                System.out.println("Такого дня недели нет");
        }
    }

    public static String describeSeason(Season season) {
        String describtion = "";

        switch (season) {
            case WINTER -> describtion = "Зима-холодно";
            case SUMMER -> describtion = "Лето - жарко";
            case SPRING -> describtion = "Все цветет";
            case AUTUMN -> describtion = "Дожди";
        }return describtion;
    }
}