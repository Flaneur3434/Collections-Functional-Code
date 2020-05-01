package com.company;
import java.util.*;

public class Main extends secondClass{
    public static void main(String[] args){
        PriorityQueue<String> queue = new PriorityQueue<>(15, new secondClass());
        queue.add("Kendall Carmel");
        queue.add("Bottle Cummer Third");
        queue.add("Ass Licker");
        queue.add("Elevator PissBottle");
        queue.add("William Hollow");

        //poll() takes the first element and displays it then deletes it
        // the Comparator sorts the queue so the shortest string is the first
        while(queue.size() != 0){
            System.out.println(queue.poll());
            System.out.println(queue.size());
        }
    }
}

