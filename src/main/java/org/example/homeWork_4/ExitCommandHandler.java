package org.example.homeWork_4;

import java.util.Scanner;

public class ExitCommandHandler {
    public static void main(String[] args) {
        exitCommandHandler();
    }


    public static void exitCommandHandler() {

        Scanner scanner = new Scanner(System.in);
        String pass = "exit";
        String x;
        do {
            System.out.println("Введите exit для завершения программы!");
            x = scanner.next();
        } while (!pass.equals(x));
    }
}
