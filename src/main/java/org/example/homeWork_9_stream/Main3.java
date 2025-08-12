package org.example.homeWork_9_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ewqfwef");
        list.add("Awqfwef");
        list.add("cwqfwef");
        list.add("Cwqfwef");
        list.add("Fwqfwef");
        list.add("Dwqfwef");

        Map<String,List<String>> newList = list.stream()
                .collect(Collectors.groupingBy(x -> x.substring(0,1)));
        System.out.println(newList);

        List<Integer> list1 = new ArrayList<>();
        list1.add(234);
        list1.add(22);
        list1.add(12);
        list1.add(33);
        list1.add(3);

        double sum = list1.stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println(sum);

        Map<Boolean,List<Integer>> newList1 = list1.stream()
                .collect(Collectors.groupingBy(x -> x % 2 ==0));
        System.out.println(newList1);



    }




}
