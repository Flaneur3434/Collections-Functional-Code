package com.company;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        String [] things = {"a", "b", "c", "d", "e"};
        List<String> list1 = new LinkedList<String>();
        //basically is a list, but can inherit more methods

        for(String x: things){
            list1.add(x);
        }

        String[] things2 = {"f", "g", "h", "i", "j"};
        List<String> list2 = new LinkedList<String>();

        for(String y: things2){
            list2.add(y);
        }

        list1.addAll (list2);
        list2 = null;

        printMe(list1);
        System.out.println();
        removeStuff(list1, 2,5);
        System.out.println();
        reverseMe(list1);
        System.out.println();
    }

    public static void printMe(List<String>listA){
      for(String b:listA){
        System.out.printf("%s", b);
        System.out.println();
      }
    }

    public static void removeStuff(List<String>listA, int a, int b){
      listA.subList(a,b).clear();
      //Take a portion of the list and delete it
    }

    public static void reverseMe(List<String>listA){
      ListIterator<String> hello = listA.listIterator(listA.size());
      //                                            -> starting point of the Iterator
      //Goes through each list iteam, iteam by iteam
      while(hello.hasPrevious()){
     //keeps moving back until it hits the end -> then returns false
        System.out.printf("%s", hello.previous());
        System.out.println();
      }
    }
}
