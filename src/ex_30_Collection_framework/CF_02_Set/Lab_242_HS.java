package ex_30_Collection_framework.CF_02_Set;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab_242_HS {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(9);
        set.add(7);
        set.add(8);
        set.add(0);
        System.out.println("Set elements " + set);


        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
