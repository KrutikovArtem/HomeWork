package org.example.homeWork_9_stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Фильтрация строк по длине больше 5
        List<String> list1 = new ArrayList<>();
        list1.add("Privet");
        list1.add("Poka");
        list1.add("Kak Dela?");
        list1.add("Hi");
        list1.add("Privetik!");

        List<String> newList1 = list1.stream()
                .filter(x -> x.length() > 5)
                .collect(Collectors.toList());
        System.out.println(newList1);


        //Фильтрация чисел, кратных 5
        List<Integer> list2 = new ArrayList<>();
        list2.add(34);
        list2.add(55);
        list2.add(5);
        list2.add(25);
        list2.add(56);

        List<Integer> newList2 = list2.stream()
                .filter(x -> x % 5 ==0)
                .collect(Collectors.toList());
        System.out.println(newList2);


        //Преобразование строк в их длины
        List<String> list3 = new LinkedList<>();
        list3.add("wefwefw");
        list3.add("wef23wefw");
        list3.add("3");
        list3.add("2342342342");
        list3.add("weew");

        List<Integer> newList3 = list3.stream()
                .map(x -> x.length())
                .collect(Collectors.toList());
        System.out.println(newList3);


        //Создание списка квадратов чисел
        //Удаление дубликатов из списка
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(43);
        list4.add(88);
        list4.add(88);
        list4.add(2);




        List<Integer> newList4 = list4.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(newList4);


        List<Integer> newList5 = list4.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(newList5);

    }

}
