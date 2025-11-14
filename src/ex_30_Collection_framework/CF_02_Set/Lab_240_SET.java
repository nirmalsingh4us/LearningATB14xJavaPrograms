package ex_30_Collection_framework.CF_02_Set;

import javax.xml.transform.Source;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_240_SET {
    public static void main(String[] args) {
        Set he = new HashSet(); //Hasing mechanism
        // for eg adhar no 8884 4455 4444
        //fasdfasfasdfkj
        // set have not duplicate elements
        he.add("Nirmal");
        he.add("Nirmal");
        he.add("Nirmal");
        he.add("lamriN");
        System.out.println(he);


        Set lhs = new LinkedHashSet();
        Set Ts = new TreeSet();
    }
}
