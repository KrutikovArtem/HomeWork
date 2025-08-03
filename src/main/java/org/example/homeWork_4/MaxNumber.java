package org.example.homeWork_4;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        MaxNumber.checkMaxNumber();
    }

    public static void checkMaxNumber(){
        System.out.print("Введите первое число: ");
        Scanner scanner1 = new Scanner(System.in);
        int first = scanner1.nextInt();
        System.out.print("Введите второе число");
        Scanner scanner2 = new Scanner(System.in);
        int second = scanner1.nextInt();

        if(first > second){
            System.out.println("Максимальное число " + first);
        }else System.out.println("Максимальное число " + second);
    }
}
