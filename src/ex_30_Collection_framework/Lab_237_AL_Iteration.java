package ex_30_Collection_framework;

import java.util.*;
import java.util.List;

public class Lab_237_AL_Iteration {

    public static void main(String[] args) {

        List<String> mylist = new ArrayList();
            mylist.add("Nirmal");
            mylist.add("Singh");
            mylist.add("Muleh");
        System.out.println("--Print the Arraylist 1--");

        for(String al : mylist){
            System.out.println(al);
        }

        System.out.println("--Print the Arraylist 2--");
        Iterator<String> iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("--Print the Arraylist 3--");

        for (int i = 0; i< mylist.size(); i++){
            System.out.println(mylist.get(i));

        }
    }
}
