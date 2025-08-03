package org.example.practice_4;

public class ForTaskSolver {
    public static void main(String[] args) {
        ForTaskSolver.multiplyTable(2);
        System.out.println(ForTaskSolver.sumNumber(10));
        System.out.println(ForTaskSolver.simpleNumber(17));
        //ForTaskSolver.isSimpleBefore100();


    }

    public static void multiplyTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(i + " * " + number + " = " + result);
        }
    }

    public static int sumNumber(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i;
        }
        return sum;
    }

    public static boolean simpleNumber(int number) {
        boolean isSimple = true;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isSimple = false;
                }
            }
        } else isSimple = false;
        return isSimple;
    }

    public static void isSimpleBefore100() {
        for (int i = 2; i <= 100; i++) {
            if (simpleNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
