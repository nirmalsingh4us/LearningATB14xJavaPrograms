package ex_30_Collection_framework.CF_04_Map;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class Lab_249_Hashtable {

    public static void main(String[] args) {

      // does not allow ,k v  null value
        // hashtable, slow and synchronized legecy class
        // thread safe, t1, t2  use one by one
        Hashtable <Integer,String> ht = new Hashtable<>();

        ht.put(1,"One");
        ht.put(2,"Two");
        ht.put(3,"Three");
        ht.put(4,null);

        System.out.println(ht);
        System.out.println(ht.size());
    }}
