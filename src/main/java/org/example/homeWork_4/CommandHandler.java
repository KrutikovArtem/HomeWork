package org.example.homeWork_4;

import java.util.Scanner;

public class CommandHandler {
    public static void main(String[] args) {
        CommandHandler.command();
    }



    public static void command(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вветите команду: \"start\", \"stop\", \"restart\" или \"status\"");
        String com = scanner.nextLine();
        switch (com){
            case "start":
                System.out.println("Программы запускается");
                break;
            case "stop":
                System.out.println("ПРограмма останавливается");
                break;
            case "restart":
                System.out.println("Программа перезапускается");
                break;
            case "status":
                System.out.println("Программа показывает статус");
                break;
            default:
                System.out.println("Такой команды нет");
        }
    }
}
