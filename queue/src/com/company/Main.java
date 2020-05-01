package com.company;
import java.util.*;

public class Main {
    //elements added are placed at the end of the queue
    //elements are removed from the beginning of the queue
    //https://beginnersbook.com/2017/08/queue-interface-in-java-collections/
    public static void main(String[] args){
//        queue is an interface sp we cannot instantiate it
//        Queue q1 = new LinkedList();
//        Queue q2 = new PriorityQueue();
        Queue<String> q = new LinkedList<>();
        q.add("Dog");
        q.add("Cat");
        q.add("Mouse");
        q.add("Human");
        q.add("Spider");

        System.out.println(q);
        //[Dog, Cat, Mouse, Human, Spider]

//      We can remove element from Queue using remove() method,
//      this would remove the first element from the Queue
        System.out.println("Removed element: " +q.remove());
        System.out.println(q);

//      element() method - this returns the head of the
//      Queue. Head is the first element of Queue
        System.out.println("Head: " + q.element());

//      poll() method - this removes and returns the
//      head of the Queue. Returns null if the Queue is empty
        System.out.println("poll():" + q.poll());
        System.out.println(q);
        //[Mouse, Human, Spider]


//      peek() method - it works same as element() method,
//      however it returns null if the Queue is empty
        System.out.println("peek():" + q.peek());



    }
}
