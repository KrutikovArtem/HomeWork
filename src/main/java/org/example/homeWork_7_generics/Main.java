package org.example.homeWork_7_generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box<String> box1= new Box<>();
        box1.setT1("Привет");

        Box<Integer> box2 = new Box<>();
        box2.setT1(234);
        System.out.println(box1.getT1());
        System.out.println(box2.getT1());

        String[] arroy = {"QWE","Weq"};
        Integer[] arroy2 = {123,123,123,35};

        MyArroyGenerics.printArray(arroy);
        MyArroyGenerics.printArray(arroy2);

        Pair<Integer,Integer> pair1 = new Pair<>(5,5);
        Pair<String,Integer> pair2 = new Pair<>("wqd",5);
        System.out.println(pair1.getFirst());
        System.out.println(pair2.getFirst());

        pair1.setFirst(86);
    }




}
