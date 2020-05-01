package com.company;
import java.util.*;

public class Main{
    public static Vector<String> alist;
    public static Vector<Object> blist;
    public static void main(String[] args){
        //Vector alist = new Vector();
        //use Object to acesss the variables
        alist = new Vector<String>();
        //Vector object= new vector(int initialcapacity, capacityIncrement)
        blist = new Vector<Object>(5,2);

        alist.add("Apple");
        alist.add("Orange");
        alist.add("Mango");
        alist.add("Gays");
        alist.add("Fairies");

        blist.add("Apple");
        blist.add("Orange");
        blist.add("Mango");
        blist.add("Gays");
        blist.add("Fairies");
        System.out.println("The initial capacity is: " + blist.capacity());
        blist.add("Grapes");
        System.out.println("When the vector exceeds 5 objects: " + blist.capacity());

        System.out.println();
        System.out.println("The initial capactiy is defualt to 10: " + alist.capacity());
        System.out.println("When exceeded, while double in size, waste of memory");
        System.out.println("Implements the list interface so can use .size(): " + alist.size());
        System.out.println();
        print(blist);
    }
    static void print(Vector<Object> xlist){
        Enumeration<Object> en = xlist.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
//https://www.youtube.com/watch?v=4BWmtZQSedU       --Vector vs Array
//https://www.youtube.com/watch?v=Gdkjv9zLb0M       --Enumeration vs Iterator
//Enumeration is for legacy classes like vector
//Can not modify the collection
//https://beginnersbook.com/2013/12/vector-in-java/ --BB Best Site