package org.example.homeWork_4;

import java.util.Scanner;

public class FivePointRatingDisplay {
    public static void main(String[] args) {
        FivePointRatingDisplay.ratingOutput();
    }


    public static void ratingOutput(){
        System.out.print("Введите оценку:");
    Scanner scanner = new Scanner(System.in);
    int grades = scanner.nextInt();
    if(5 == grades){
        System.out.println(grades + " - Отлично!");
    }else if(4 == grades){
        System.out.println(grades + " - Хорошо");
    }else if(3 == grades){
        System.out.println(grades + " - Удовлетворительно");
    }else if (2 == grades || 1 == grades){
        System.out.println(grades + " - Неудовлетворительно");
    }else System.out.println(grades + " - Такой оценки не существует");

}}
