package org.example.homeWork_4;

import java.util.Scanner;

public class SimpleCalculate {

    public static void main(String[] args) {
        SimpleCalculate.calculation();
    }


    public static void calculation(){
        Scanner scanner1 =new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first = scanner1.nextInt();
        Scanner scanner2 =new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int second = scanner2.nextInt();
        Scanner scannerOperator =new Scanner(System.in);
        System.out.println("Введите оператор: +, -, *, / ");
        String operator = scannerOperator.next();

        switch (operator){
            case "+":
                System.out.println(first+second);
                break;
            case "-":
                System.out.println(first-second);
                break;
            case "*":
                System.out.println(first*second);
                break;
            case "/":
                if(second == 0){
                    System.out.println("На ноль делить нелья");
                    break;
                }else System.out.println(first/second);

        }

    }
}
