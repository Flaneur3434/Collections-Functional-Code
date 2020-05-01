package com.company;
import java.util.*;

public class Main {
    //Deque is an interface and can be implemented by LinkedList and ArrayDeque
    //Deque dq = new LinkedList();
    //Deque dq2 = new ArrayDeque();
    public static void main(String[] ags){
        Deque<String> dq = new ArrayDeque<>();
        dq.add("Cow");
        dq.add("Cat");
        dq.add("Dog");
        dq.add("Spider");
        dq.add("Rat");
        dq.add("Fcuking Tyler");

        System.out.println("Elements in Deque: " + dq);
        Iterator it = dq.iterator();
        while(dq.size() != 0){
            System.out.println("Elements: " + dq.pollLast() + " : " + " Size: " + dq.size());
        }
    }
    //When to use ArrayList and when to use ArrayDeque
    //ArrayDeque has the ability to add or remove the elements from both ends
    //If you want to remove the last element from a ArrayList, it takes time
    //Use ArrayDeque if you are modifying both ends
    //Use ArrayList if only modifying at the tail
    //https://beginnersbook.com/2017/08/java-collections-deque-interface/
}