package ex_30_Collection_framework.CF_04_Map;

import java.util.*;

public class Lab_247_Map_iteration {

    public static void main(String[] args) {

        Map<String, Integer> m = new HashMap();
        m.put("ID1",1);
        m.put("ID2",2);
        m.put("ID3",44);
        m.put("ID4",55);
        m.put("ID5",66);
        m.put(null,100);
        System.out.println(m);
        System.out.println(m.size());

        for(Map.Entry<String,Integer> item : m.entrySet())
        {
            System.out.println(item.getKey() + "->"+item.getValue());


        }
    }}

