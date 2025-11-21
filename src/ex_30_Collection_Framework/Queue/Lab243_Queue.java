package ex_30_Collection_Framework.Queue;

import java.util.PriorityQueue;

public class Lab243_Queue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add("Pramod");
        pq.add("Dutta");
        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
