package ex_30_Collection_framework.CF_03_Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab_Linkedqueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(7);
        queue.add(9);

        Iterator<Integer> iterator = queue.iterator();
        while ((iterator.hasNext())){
            Integer value=  iterator.next();
            System.out.println(value);
        }
    }


}
