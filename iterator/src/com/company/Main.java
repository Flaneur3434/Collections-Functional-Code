package com.company;
import java.util.*;

public class Main{
    public static LinkedList<String> alist = new LinkedList<String>();

    public static void main (String[] args){
        secondClass a = new secondClass();
        set(3,"Fuck you tyler you fucking neet");
        print();
        add(2,"This has been added Where?");
        print();
    }
    static void get(int x){
        Object y = alist.get(x);
        System.out.println(y);
    }
    static void set(int x, String y){
        alist.set(x,y);
        Object xyz = alist.get(x);
        System.out.println("/* " + xyz + " */ has been added to list a\n");
    }

    static void add(int y, String x){
        alist.add(y,x);
    }

    static void remove(String x){
        alist.remove(x);
    }

    static void print() {
        Iterator<String> it = alist.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
    }

    public static class subMain extends com.company.Main {

    }

}

public class secondClass{
    secondClass(){
        com.company.Main.subMain a = new com.company.Main.subMain();
        a.add(0,"Shut");
        a.add(1, "The");
        a.add(2, "Fuck");
        a.add(3, "Up");
        a.add(4, "Asshole");
        a.print();

    }
}


