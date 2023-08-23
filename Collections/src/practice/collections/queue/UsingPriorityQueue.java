package practice.collections.queue;

import java.util.PriorityQueue;

public class UsingPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> myFirstPriorityQueue = new PriorityQueue<>();

        myFirstPriorityQueue.offer(24);
        myFirstPriorityQueue.offer(15);
        myFirstPriorityQueue.offer(9);
        myFirstPriorityQueue.offer(45);

        System.out.println(myFirstPriorityQueue.poll());
        System.out.println(myFirstPriorityQueue.poll());
        System.out.println(myFirstPriorityQueue.poll());
        System.out.println(myFirstPriorityQueue.poll());
    }
}
