package org.example.homeWork_6_collection.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQueueAndArrayDeque {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(50);
        priorityQueue.add(234);
        priorityQueue.add(50234);
        priorityQueue.add(3);
        priorityQueue.add(4);

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Первый");
        arrayDeque.add("Второй");
        arrayDeque.add("Третий");
        arrayDeque.add("Черве");

        for(String s: arrayDeque){
            System.out.println(s);
        }
    }
}
