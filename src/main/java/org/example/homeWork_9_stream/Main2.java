package org.example.homeWork_9_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.add(435);
        list1.add(1);
        list1.add(22);
        list1.add(1231);
        list1.add(33);


        boolean newlist5 = list1.stream()
                .anyMatch(x -> x % 2 == 0);
        System.out.println(newlist5);

        Optional<Integer> newList1 = list1.stream()
                .max(Comparator.naturalOrder());
        if(newList1.isPresent()){
            System.out.println("Макс число: " + newList1.get());
        }else System.out.println("Лист пустой");

        Optional<Integer> newList2 = list1.stream()
                .min(Comparator.naturalOrder());
        if(newList2.isPresent()){
            System.out.println("Мин значение: " + newList2.get());
        }else System.out.println("Лист пуст");


        int sum = list1.stream()
                .mapToInt(x -> x)
                .sum();
        System.out.println(sum);


        List<String> list2 = new ArrayList<>();
        list2.add("Какты?");
        list2.add("Брово");
        list2.add("Привет");
        list2.add("Борис");
        list2.add("Корова");
        list2.add("Собака");

        Optional<String> optional1 = list2.stream()
                .filter( x -> x.startsWith("Б"))
                .findFirst();
        System.out.println(optional1);


    }
}
