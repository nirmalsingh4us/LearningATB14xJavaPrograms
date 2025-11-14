package ex_30_Collection_framework.CF_02_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_241_Set_Hs_LHs_TS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        // Hashing mechanism to store the elements , no order
        // no duplicate elements

        hs.add("apple");
        hs.add("apple") ;
        hs.add("orange");
        hs.add("Watermelon");
        hs.add(null);
        System.out.println(hs);


        System.out.println("------------------");

        Set lhs = new LinkedHashSet();

        //order will be maintain  but no duplicate allow
        lhs.add("Dpple");
        lhs.add("apple") ;
        lhs.add("apple") ;
        lhs.add("orange");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.size());

        System.out.println("-0-0-0-0-0-0-0-0-0-0-0-");

        Set Ts = new TreeSet();
        // Black and Red Tree mechanism to store the elements
        // Natural order will maintain, Natural sorting is done
        Ts.add("add fruitname");
        Ts.add("gpple");
        Ts.add("wpple");
        Ts.add("ipple") ;
        Ts.add("dpple") ;
        Ts.add("erange");
        Ts.add("fWatermelon");
        //Ts.add(null);
        System.out.println(Ts);
//        System.out.println(Ts.isEmpty());
//        System.out.println(Ts.contains("apple"));
//        System.out.println(Ts.size());


    }
}
