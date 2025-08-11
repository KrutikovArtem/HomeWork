package org.example.homeWork_7_exception;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileNotFoundException {

    public static void openFile(){
        try {
            File file = new File("text.txt");
            Scanner scanner = new Scanner(file);
        }catch (FileNotFoundException e){
            System.out.println("Файл не найдет");
        }
    }
}
