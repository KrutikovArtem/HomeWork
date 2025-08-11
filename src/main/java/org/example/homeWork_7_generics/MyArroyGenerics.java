package org.example.homeWork_7_generics;

public class MyArroyGenerics {


    public static <T> void printArray(T[] arroy){
        for (T element: arroy){
            System.out.println(element);
        }
    }

}
