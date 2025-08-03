package org.example.homeWork_4;

public class SkipMultiplesOfThree {
    public static void main(String[] args) {
        skip();
    }


    public static void skip(){

        for (int i = 1; i <= 20; i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
