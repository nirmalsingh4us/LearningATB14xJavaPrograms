package ex_30_Collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Lab_227_List {
    public static void main(String[] args) {
        List fruit = List.of("Orange", "Apple", "Watermelon", "Banana", "Grapes");
        System.out.println(fruit);

        List arrylist = new ArrayList();
        arrylist.add("Nirmal");
        arrylist.add("Nirmal");
        arrylist.add("singh");
        arrylist.add(3.13);
        arrylist.add(true);
        arrylist.add(123);

        System.out.println(arrylist.size());
        System.out.println(arrylist);


    }
}