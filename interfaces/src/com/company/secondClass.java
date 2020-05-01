package com.company;

interface secondClass {
    void firstMethod(int x);
    default void secondMethod(){
        System.out.println("secondMethod from secondClass");
    }
    default void thirdMethod(){
        System.out.println("thirdMethod from secondClass");
    }
}