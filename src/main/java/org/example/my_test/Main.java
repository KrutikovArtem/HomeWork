package org.example.my_test;

public class Main {

    public static void main(String[] args) {
        Box<Integer> box = new Box();
        Box<Integer> box1 = new Box();

        box.setNum(50);
        box1.setNum(50);



        System.out.println(box.equals(box1));



    }
}
