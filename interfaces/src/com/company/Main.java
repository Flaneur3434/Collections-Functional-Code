package com.company;

public class Main implements secondClass, thirdClass{

    public static void main(String[] args) {
        Main a = new Main();

        secondClass b = (int x) -> System.out.println(x);
        thirdClass c = (int x) -> {
            double d= x;
            System.out.println(d*x);
        };
        System.out.println();


        b.firstMethod(24);
        b.secondMethod();
        b.thirdMethod();
        System.out.println();

        c.firstMethod(24);
        c.secondMethod(24);
        c.thirdMethod(24);
        System.out.println();

        a.firstMethod(24);
        a.secondMethod(24);
        a.thirdMethod(24);
    }

    @Override
    public void firstMethod(int x) {
        System.out.println("firstMethod from secondClass");
    }
}