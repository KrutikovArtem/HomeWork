package org.example.my_test;

public class Operation2 {

    public static void calcul(int x, int y){
        try {
            System.out.println(x / y);
        }catch (ArithmeticException a){
            System.out.println("Деление на ноль нельзя");
        }
    }
}
