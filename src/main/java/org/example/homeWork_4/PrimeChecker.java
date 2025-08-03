package org.example.homeWork_4;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        checkPrimeChecker();
    }
    public static void checkPrimeChecker() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вветите число: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("Число 1 не является простым");
            scanner.close();
            return;
        }
        boolean isPrime = true;
        int limit = (int)Math.sqrt(number);
        for(int i = 2; i <= limit; i++){
            if(number % i == 0){
                isPrime=false;
                break;
            }
        }if(isPrime){
            System.out.println("Число простое");
        }else System.out.println("Число не простое");
        scanner.close();
    }
}
