package org.example.homeWork_6_collection.linkedHeshMapAndTreeMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TaskMapTL {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Корова",15);
        linkedHashMap.put("Ежик",10);
        linkedHashMap.put("Конь",20);
        linkedHashMap.put("Лиса",7);
        linkedHashMap.put("Бык",2);

        for(Map.Entry<String,Integer> animal: linkedHashMap.entrySet()){
            System.out.println(animal);
        }

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(1123,9);
        treeMap.put(1,123);
        treeMap.put(111223,123);
        treeMap.put(55,5);
        treeMap.put(123131231,55);

        for (Map.Entry<Integer,Integer> balls : treeMap.entrySet()){
            System.out.println(balls);
        }
    }




}
