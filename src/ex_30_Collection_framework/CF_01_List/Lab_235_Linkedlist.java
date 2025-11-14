package ex_30_Collection_framework.CF_01_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab_235_Linkedlist {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new ArrayList(10);
        List list2 = List.of("22",55,"44");
        List list3  = new LinkedList();
        List list4 = new LinkedList();

        list4.add("nirmal");
        list4.add("singh");
        list4.add(11);
        list4.add("nirmal");
        System.out.println(list4);

    }
}
