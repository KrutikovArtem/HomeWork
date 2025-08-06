package org.example.homeWork_6_collection.hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class TaskHashSet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя для поиска: ");
        String name = scanner.next();

        HashSet<String> names = new HashSet<>();
        names.add("Коля");
        names.add("Петя");
        names.add("Вася");
        names.add("Маша");

        if(names.contains(name)){
            System.out.println("Такое имя найдено!!!");
        }else System.out.println("Такого имени нет.......");

        HashSet<Integer> numbers1 = new HashSet<>();
        numbers1.add(1);
        numbers1.add(13);
        numbers1.add(134);
        numbers1.add(114);

        for(int i: numbers1){
            System.out.println(i);
        }


    }

}
