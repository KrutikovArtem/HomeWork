package org.example.homeWork_6_collection.arroyList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_list {
    public static void main(String[] args) {


        List<Integer> fixList = Arrays.asList(1,2,3,4,5);

        ArrayList<Integer> numbers1 = new ArrayList<>(fixList);
        numbers1.add(6);
        for(int i : numbers1)
        System.out.print(i);


        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(454);
        numbers2.add(4);
        numbers2.add(45);
        numbers2.add(5);
        numbers2.add(9);
        numbers2.add(10);
        for(int i : numbers2){
            if(i % 2 ==0){
                System.out.println(i);
            }
        }

        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("Москва");
        strings1.add("Новокузнецк");
        strings1.add("Уфа");
        strings1.add("Самара");
        strings1.add("Орел");

        String max =strings1.get(0);

        for(String s : strings1){
            if(max.length() < s.length()){
                max = s;
            }

        }System.out.println(max);

    }


}
