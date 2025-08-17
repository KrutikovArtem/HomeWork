package org.example.homeWork_10_multithreading;

public class Task3 {

    private static volatile boolean stop = false;
    private static int count = 0;


    public static void task3(){
        Thread thread = new Thread(() -> {
            while (!stop){
                count++;
            }
            System.out.println("Счетчик равен: " + count);


        });
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }stop = true;

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
