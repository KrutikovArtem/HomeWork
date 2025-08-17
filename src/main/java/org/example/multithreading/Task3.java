package org.example.multithreading;

public class Task3 {
    public static volatile boolean stop = false;
    public static int count = 0;
    public static void task3(){

        Thread thread = new Thread(() -> {
            while (!stop){
                count++;
            }
            System.out.println("Счетчик: " + count);
        });
        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        stop = true;
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
