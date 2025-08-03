package org.example.practice_4;

public class IfElseTaskSolver {

    public static void main(String[] args) {
        IfElseTaskSolver taskSolver = new IfElseTaskSolver();
        System.out.println(taskSolver.checkParity(5));
        System.out.println(taskSolver.checkParity(10));
        taskSolver.checkAge(61);
        System.out.println(taskSolver.checkMax(100,5,200));
        System.out.println(taskSolver.checkMax(1000,500,2));
        System.out.println(taskSolver.checkMax(9,11,7));

    }

    String checkParity(int number) {
        String parity = "Нечетное";
        if (number % 2 == 0) {
            parity = "Четное";
        }
        return parity;
    }

    void checkAge(int age) {
        if (age < 18) {
            System.out.println("Несовершеннолетний");
        }
        if (age > 18 && age < 60) {
            System.out.println("Взрослый");
        }
        if (age > 60) System.out.println("Пожилой");
    }

    int checkMax(int q, int w, int e) {
        int max = q;
        if (q < w) {
            max = w;
        }
        if (e > max){
            max = e;
        }return max;
    }
}
