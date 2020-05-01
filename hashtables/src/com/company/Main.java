package com.company;
import java.util.*;

public class Main {
    //hashtables are synchronized, hashmaps are not
    //Hashmaps can be accessed by mutliple threads
    //Hashmaps allow for 1 null key and any number of null values
    //hashmaps can be a linked or tree type to get a order
    //hashtables dont have any order
    //https://beginnersbook.com/2014/06/difference-between-hashmap-and-hashtable/
    public static void main(String[] arg){
        Iterator it;
        String key;

        Hashtable<Integer, String> htable = new Hashtable<>();

        htable.put(1, "cat");
        htable.put(2, "dog");
        htable.put(3, "human");
        htable.put(4, "chimp");
        htable.put(5, "spider");
        htable.put(6, "pig");

        Set set = htable.entrySet();
        it = set.iterator();

        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            System.out.println("key is " + me.getKey() + " : " + "value is " + me.getValue());
        }
    }
}

