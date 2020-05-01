package com.company;

interface thirdClass {
    void firstMethod(int x);
    default void secondMethod(int a){
        System.out.println("secondMethod from thirdClass");
    }
    default void thirdMethod(int a){
        System.out.println("thirdMethod from thirdClass");
    }
}
