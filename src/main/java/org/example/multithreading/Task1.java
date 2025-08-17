package org.example.multithreading;

public class Task1 {

    public static void task1(){
        Thread thread = new Thread(() -> {
            for(int i = 0 ; i < 5 ; i++){
                System.out.println("Поток идёт");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
