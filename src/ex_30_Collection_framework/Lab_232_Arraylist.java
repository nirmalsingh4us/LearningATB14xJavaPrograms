package ex_30_Collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab_232_Arraylist {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(80);
        marks.add(89);
        marks.add(50);
        marks.add(76);
        marks.add(81);
        marks.add(82);
        marks.add(88);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
        // not sorting method is mentioned here it is.it is natural order

    }
}
