package org.example.homeWork_6_collection.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueAndArrayDeque {
    String qwe = "qqq";
    String qweqweqw = "qqq";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriorityQueueAndArrayDeque that = (PriorityQueueAndArrayDeque) o;
        return Objects.equals(qwe, that.qwe) && Objects.equals(qweqweqw, that.qweqweqw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qwe, qweqweqw);
    }

    public static void main(String[] args) {

        String asd = "ppp";
        String khk = new String("ppp");
        String das = "ppp";

        PriorityQueueAndArrayDeque t1 = new PriorityQueueAndArrayDeque();
        t1.qwe = "Ga";
        PriorityQueueAndArrayDeque t2 = new PriorityQueueAndArrayDeque();
        t2.qwe = "Ga";
        System.out.println(t1.equals(t2));

        System.out.println(t1.qweqweqw.equals(t2.qweqweqw));


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(50);
        priorityQueue.add(234);
        priorityQueue.add(50234);
        priorityQueue.add(3);
        priorityQueue.add(4);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Первый");
        arrayDeque.add("Второй");
        arrayDeque.add("Третий");
        arrayDeque.add("Черве");

        for (String s : arrayDeque) {
            System.out.println(s);
        }
    }
}
