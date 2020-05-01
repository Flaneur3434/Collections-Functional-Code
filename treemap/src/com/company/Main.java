package com.company;
import java.util.*;

public class Main {
    public static Map<Integer, String> hmap = new HashMap<>();
    public static Map<Integer, String> tmap = new TreeMap<>();
    //hashmap are unordered
    //treemaps are ordered(ascending order of its keys)

    public static void main(String[] args){
        tmap.put(1,"a");
        tmap.put(2, "b");
        tmap.put(3, "c");
        tmap.put(4, "d");
        tmap.put(5, "e");

        hmap.put(1, "a");
        hmap.put(2, "b");
        hmap.put(3, "c");
        hmap.put(4, "d");
        hmap.put(5, "e");

        Set tset = tmap.entrySet();
        Set hset = hmap.entrySet();

        Iterator it = tset.iterator();
        Iterator it2 = hset.iterator();

        while(it.hasNext()){
            //(Map.Entry) it.next(); is a cast
            Map.Entry tme = (Map.Entry) it.next();
            System.out.println("Key: " + tme.getKey() + " : " + "Value: " + tme.getValue());
        }

        System.out.println();

        while(it2.hasNext()){
            //(Map.Entry) it2.next(); is a cast
            Map.Entry hme = (Map.Entry) it2.next();
            System.out.println("Key: " + hme.getKey() + " : " + "Value: " + hme.getValue());
        }

    }
}
