package org.example.homeWork_4;

public class MultiplesOfThreePrinter {

    public static void main(String[] args) {
        MultiplesOfThreePrinter.printer();

    }

    public static void printer(){
        for(int i = 1; i <= 100; i++){
            if(i % 3== 0){
                System.out.println(i);
            }
        }
    }
}
