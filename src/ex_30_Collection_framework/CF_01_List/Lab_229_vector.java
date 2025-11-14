package ex_30_Collection_framework.CF_01_List;

import java.util.Vector;

public class Lab_229_vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Nirmal");
        v.add("Singh");
        System.out.println(v);
        v.remove("Singh");
        System.out.println(v);
        System.out.println(v.contains("Nirmal"));
    }
}
