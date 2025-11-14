package ex_30_Collection_framework.CF_04_Map;

import java.util.*;

public class Lab_246_Map_real {
    public static void main(String[] args) {
        Map<String ,Object> std1 = new HashMap<>();
        std1.put("Name", "Nirmal");
        std1.put("phone", "628445986");
        std1.put("Address", "Vill Sultanwind Amritsar");
        std1.put("City", "Amritsar");

        System.out.println(std1);

        Map<String ,Object> std2 = new LinkedHashMap<>();
        std2.put("Name", "Param");
        std2.put("phone", "628445988");
        std2.put("Address", "Vill Sultanwind Amritsar");
        std2.put("City", "Amritsar");

        System.out.println(std2);


        Set Book_item = new HashSet();
        Book_item.add("Brave heart");
        Book_item.add("The king of punjab");
        Book_item.add("Maharaja Ranjit singh");
        Book_item.add("1947 to 1984, a pain");

        System.out.println(Book_item);



    }
}
