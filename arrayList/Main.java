package com.company;
import java.util.*;

public class Main {
    public static ArrayList<String> alist = new ArrayList<String>();
    public static ArrayList<Integer> blist = new ArrayList<Integer>();
    static{
        add(123761283);
        add(345345887);
        add(745872348);
        add(123456);
        add(123456);
        add(1);
        add(123);
        addS("Dog");
        addS("Cat");
        addS("Sister");
        addS("Brother");
        addS("Brother");
        addS("Lain");
    }
    public static void main(String[] args) {
        print();
        printS();
        overLap();
        overLapS();
        print();
        printS();
    }

    public static void add(int addTo){
        blist.add(addTo);
    }

    public static void addS(String addTo){
        alist.add(addTo);
    }

    public static void remove(int index){
        blist.remove(index);
    }

    public static void removeS(String object){
        alist.remove(object);
    }

    public static void print(){
        System.out.println();

        Collections.sort(blist);
        for(Integer x: blist){
            System.out.println(x);
        }
    }

    public static void printS(){
        System.out.println();

        Collections.sort(alist);
        for(String x : alist){
            System.out.println(x);
        }
    }

    public static void overLap(){
        Collections.sort(blist);
        for(int x = 0; x < blist.size()-1; x++){
            int first = blist.get(x);
            int second = blist.get(x+1);
            if(first == second){
                blist.remove(x);
                blist.remove(x);
            }
        }
    }


    public static void overLapS(){
        Collections.sort(alist);
        for(int x = 0; x < alist.size()-1; x++){
            String first = alist.get(x);
            String second = alist.get(x+1);
            if(first == second){
                alist.remove(x);
                alist.remove(x);
            }
        }
    }
}
