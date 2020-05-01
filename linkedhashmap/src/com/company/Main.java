package com.company;
import java.util.*;

public class Main {
    //hashmap doesn't maintain any order
    //treemap sorts the entries in ascending order of keys
    //linkedhashmap maintains the insertion oder
    public static void main(String[] args){
        Map<Integer, String> lhmap = new LinkedHashMap<>();
        List<Integer> llist = new LinkedList<>();

        lhmap.put(1, "a");
        lhmap.put(2, "b");
        lhmap.put(3, "c");
        lhmap.put(4, "d");
        lhmap.put(5, "e");
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);
        llist.add(5);

        Set set = lhmap.entrySet();

        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry) it.next();
            System.out.println("Key; " + me.getKey() + " : " + "Value; " + me.getValue());
        }

        System.out.println();

        Iterator it2 = llist.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
