package ex_30_Collection_framework.CF_03_Queue;

import java.util.PriorityQueue;

public class LAb_243_queue {
    //queue-> 0.001 used in automation
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add("Nirmal");
        pq.add("Singh");
        System.out.println(pq); // natural sorting

        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq
        );
    }
}
