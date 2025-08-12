package org.example.homeWork_9_funcInterf;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        MathOperation add = (x, y) -> (x + y);
        MathOperation vichit = (x, y) -> (x - y);
        MathOperation ymnoj = (x, y) -> (x * y);
        MathOperation delenie = (x, y) -> (x / y);

        System.out.println(add.calcul(4,4));
        System.out.println(vichit.calcul(4,4));
        System.out.println(ymnoj.calcul(4,4));
        System.out.println(delenie.calcul(4,4));

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        }; runnable.run();


        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(4));

        Function<String,Integer> function = x -> x.length();
        System.out.println(function.apply("34eweffdfredftr"));

        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Приветик");
    }
}
