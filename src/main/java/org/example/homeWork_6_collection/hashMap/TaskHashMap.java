package org.example.homeWork_6_collection.hashMap;

import java.util.HashMap;
import java.util.Map;

public class TaskHashMap {

    public static void main(String[] args) {

        HashMap<String,Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Vasa", 18);
        hashMap1.put("Sasha", 25);
        hashMap1.put("Galya", 45);
        hashMap1.put("Marina", 15);

        String name1="Sasha";

        for(Map.Entry<String,Integer> man:hashMap1.entrySet()){
            if(name1.equals(man.getKey())){
                System.out.println(man.getValue());
            }
        }

        for(Map.Entry<String,Integer> man:hashMap1.entrySet()){
            String name = man.getKey();
            int age = man.getValue();
            System.out.println(name + "=" + age);
        }


        }
    }

