package org.example.homeWork_7_exception;

public class MyArithmeticException {
    public static void calcul(int x, int y){
        try {
            int z = x / y;
            System.out.println(z);
        }catch (ArithmeticException e){
            System.out.println("Делить на ноль нельзя");
        }
    }
}
