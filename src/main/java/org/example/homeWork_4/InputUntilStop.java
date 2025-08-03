package org.example.homeWork_4;

import java.util.Scanner;

public class InputUntilStop {
    public static void main(String[] args) {
        input();
    }



    public static void input(){


        Scanner scanner = new Scanner(System.in);
        String scan;

        while (true){
            System.out.println("Ввидите слово stop, чтобы завершилась программ: ");
            scan =scanner.next();
            if(scan.equals("stop")){
                break;
            }
        }
    }
}
