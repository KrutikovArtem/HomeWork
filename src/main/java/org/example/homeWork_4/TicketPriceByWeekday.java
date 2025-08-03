package org.example.homeWork_4;

import java.util.Scanner;

public class TicketPriceByWeekday {
    public static void main(String[] args) {
        TicketPriceByWeekday.checkPrice();
    }


    public static void checkPrice() {

        System.out.print("Введите число 1-5 или 6-7: ");
        Scanner scanner = new Scanner(System.in);
        int week = scanner.nextInt();
        if (week <= 0){
            System.out.println("Такого дня недели нет");
        }else if (week >= 1 && week <=5){
            System.out.println("Цена билета 300 рублей");
        }else if(week >= 6 && week <= 7){
            System.out.println("Цена билета равно 500");
        }else System.out.println("Такого дня недели нет");
    }
}
