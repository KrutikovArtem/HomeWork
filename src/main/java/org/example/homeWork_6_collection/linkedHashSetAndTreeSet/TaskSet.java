package org.example.homeWork_6_collection.linkedHashSetAndTreeSet;

import java.util.LinkedHashSet;
import java.util.TreeSet;


public class TaskSet {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("Корова");
        linkedHashSet.add("Барашек>");
        linkedHashSet.add("Коза");
        linkedHashSet.add("Курица");
        linkedHashSet.add("Корова");
        linkedHashSet.add("Верблюд");

        for(String s: linkedHashSet){
            System.out.println(s);
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(123123123);
        treeSet.add(1);
        treeSet.add(123);
        treeSet.add(233);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);

        for(int s: treeSet){
            System.out.println(s);
        }


        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("qwdqw");
        treeSet1.add("asdad");
        treeSet1.add("ljkljk");
        treeSet1.add("zzzzz");

        for(String s: treeSet1){
            System.out.println(s);
        }
    }
}
