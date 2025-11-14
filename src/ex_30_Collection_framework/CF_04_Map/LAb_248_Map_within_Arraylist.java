package ex_30_Collection_framework.CF_04_Map;

import java.util.LinkedHashMap;
import java.util.*;

public class LAb_248_Map_within_Arraylist {
    public static void main(String[] args) {

      HashMap<String, String> std1 = new HashMap<>();
        std1.put("Name", "Nirmal");
        std1.put("phone", "628445986");
        std1.put("Address", "Vill Sultanwind Amritsar");
        std1.put("City", "Amritsar");

        System.out.println(std1);

        HashMap<String, String> std2 = new HashMap<>();
        std2.put("Name", "Param");
        std2.put("phone", "628445988");
        std2.put("Address", "Vill Sultanwind Amritsar");
        std2.put("City", "Amritsar");
        System.out.println(std2);

        List Students = new ArrayList();
        Students.add(std1);
        Students.add(std2);
        System.out.println(Students);

    }
}
