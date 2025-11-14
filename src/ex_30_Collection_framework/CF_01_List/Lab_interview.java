package ex_30_Collection_framework.CF_01_List;

import java.util.ArrayList;
import java.util.Collections;

public class Lab_interview {
    public static void main(String[] args) {
        ArrayList<Integer> Al = new ArrayList<>();
        Al.add(1);
        Al.add(2);
        Al.add(3);
        Al.add(4);
        Al.add(5);
        System.out.println(Al);
        Collections.sort(Al,Collections.reverseOrder());

        for (Integer o : Al)
        {
            System.out.println(6*o);
        }
    }
}
