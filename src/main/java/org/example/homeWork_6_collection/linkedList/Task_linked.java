package org.example.homeWork_6_collection.linkedList;

import java.util.LinkedList;

public class Task_linked {

    public static void main(String[] args) {

        LinkedList<Integer> numbers1 = new LinkedList<>();
        numbers1.add(1);
        numbers1.add(112);
        numbers1.add(12);
        numbers1.add(1312);
        numbers1.add(13);
        for(int i : numbers1){
            System.out.println(i);
        }


        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Умыться");
        tasks.add("Позавтракать");
        tasks.add("Накормить собаку");
        tasks.add("Выгулить собаку");

        while (!tasks.isEmpty()){
            System.out.println("Задания выполнил: " + tasks.poll());
        }
    }
}
