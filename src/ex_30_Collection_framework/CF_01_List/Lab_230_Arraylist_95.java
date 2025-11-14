package ex_30_Collection_framework.CF_01_List;

import java.util.ArrayList;
import java.util.List;

public class Lab_230_Arraylist_95 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Bread");
        list.add("milk");
        list.add("Butter");
        list.add("Curd");
        list.add("Cheeze");
        list.add(978052751);
        list.add(true);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(1));
        System.out.println("-^-^-^-^-^-");

        for(Object o : list){
            System.out.println(o);
        }
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}
