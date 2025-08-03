package org.example.practice_4;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        //WhileTaskSolver.shetchik();
        WhileTaskSolver.commandReader();
    }
    public static void shetchik(){
        int i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
    }

    public static void commandReader(){
        Scanner scanner = new Scanner(System.in);
        String command ="";
        while (!command.equals("exit")){
            System.out.println("ВВедите команду: ");
            command = scanner.nextLine();


        }System.out.println("Программа завершена");
    }
}
