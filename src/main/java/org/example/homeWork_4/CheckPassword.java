package org.example.homeWork_4;

import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {
        checkPass();
    }


    public static void checkPass() {

        Scanner scanner = new Scanner(System.in);
        String password = "dada";
        String scan;

        do {
            System.out.print("Введите пароль: ");
            scan = scanner.next();

        } while (!password.equals(scan));
        if (password.equals(scan))
            System.out.println("Вход");
    }
}
