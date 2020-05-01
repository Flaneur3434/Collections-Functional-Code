package com.company;
import java.util.*;

public class Main {

    //Comparable Interface os ,aomly used to sort the arrays(or lists) of custom objects
    //If implemented Comparable interface can be sorted automatically
    public static void main(String[] args){
//        int[] aggs = {1, 22, 33, 44, 55};
//        Arrays.sort(aggs);
//        System.out.print("Sort Int Array: ");
//        System.out.println(Arrays.toString(aggs));
////      System.out.println(aggs);
////      [I@1fbc7afb
//
//
//        List<Integer> alist = new ArrayList<>();
//        alist.add(12);
//        alist.add(324);
//        alist.add(4561);
//        alist.add(19283);
//        alist.add(18724);
//        alist.add(12893);
//        Collections.sort(alist);
//        System.out.print("Sort Int ArrayList: ");
//        for(int i = 0; i<=alist.size()-1; i++){
//            if(i == 0){
//                System.out.print("[" + alist.get(0) + ", ");
//            }
//            else if(i != alist.size()-1){
//                System.out.print(alist.get(i) + ", ");
//            }
//            else if(i == alist.size()-1){
//                System.out.print(alist.get(i) + "]");
//            }
//        }
        ArrayList<secondClass> al = new ArrayList<>();
        al.add(new secondClass("Kendall", "Carmel", "Jeff"));
        al.add(new secondClass("Tyler", "Carmel", "Joe"));
        al.add(new secondClass("George R. R.", "Martin", "Song of Ice and Fire"));

        //we can use Collections.sort() method becuase Comparable interface is implemented
        Collections.sort(al);
        for(secondClass sc : al){
            System.out.println(sc.firstName + " " + sc.lastName + " " + "Book: " + sc.slavesName);
        }
    }
}

