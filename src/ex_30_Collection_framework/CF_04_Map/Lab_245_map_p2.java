package ex_30_Collection_framework.CF_04_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_245_map_p2 {
    public static void main(String[] args) {
       // Map mp = new HashMap(); we can also same in the following way
        HashMap mp = new HashMap();
        mp.put("id",1);
        mp.put("Coloumn",2);
        mp.put("name",3);
        mp.put("surname",4);
        mp.put("add",5);
        mp.put(null,7);
        mp.put("id6",null);
        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.get("id6"));
    }
}
