package ex_30_Collection_framework.CF_04_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_244_Map {
    public static void main(String[] args) {
        //Map m1= new map(); not allow bcz its is interface
        Map m1= new HashMap();

        m1.put("name", "Nirmal");
        m1.put("Rollno", "13");
        m1.put("phonono",978052751);

        System.out.println(m1);
        System.out.println("--------");

        Map m2 = new LinkedHashMap();
        m2.put("name", "Nirmal");
        m2.put("Rollno", "13");
        m2.put("phonono",978052751);

        System.out.println(m2);
        System.out.println("--------");

        Map m3 = new TreeMap();
        m3.put("Name", "Nirmal");
        m3.put("Rollno", "13");
        m3.put("Phonono",978052751);
        System.out.println(m3);


    }
}
