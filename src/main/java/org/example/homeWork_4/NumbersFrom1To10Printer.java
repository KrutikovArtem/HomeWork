package org.example.homeWork_4;

public class NumbersFrom1To10Printer {
    public static void main(String[] args) {
        numbersFrom1To10Printer();
    }


    public static void numbersFrom1To10Printer() {

        int n = 10;
        do {
            System.out.println(n);
            n--;
        } while (n >= 0);
    }
}
