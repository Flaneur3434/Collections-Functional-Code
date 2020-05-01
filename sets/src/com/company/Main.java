package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args){
        //hashset dont retain order and can randomly rearrange
        //linkedhashsets retain order
        //treesets sort in natural order (if string, sorts alphabetical)(if integer, sorts in numerical small to big)
        Set<String> hset = new HashSet<>();
        hset.add("cat");
        hset.add("dog");
        hset.add("mouse");
        hset.add("tiger");
        hset.add("human");
        hset.add("whale");
        hset.add("chimp");

        System.out.println(hset);
        //[mouse, whale, chimp, cat, tiger, dog, human]
        hset.add("dog");

        System.out.println(hset);
        //[mouse, whale, chimp, cat, tiger, dog, human]

        System.out.println();////////////////////////////////Iteration

        for(String x : hset){
            System.out.println(x);
        }

        System.out.println();////////////////////////////////Contains?

        if(!hset.contains("ape")){
            System.out.println("hset does not contain 'apes': ");
            hset.add("ape");
            System.out.println(hset);
        }

        System.out.println();////////////////////////////////Intersection

        Set<String> hset2 = new HashSet<>();
        hset2.add("cat");
        hset2.add("dog");
        hset2.add("rat");
        hset2.add("tiger");
        hset2.add("lizard");
        hset2.add("whale");
        hset2.add("ape");

        //trying to set which elements are overlapping in hset and hset2
        Set<String> intersection = new HashSet(hset);
        //creating a copy of hset

        intersection.retainAll(hset2);
        System.out.println("intersection will look through hset2 and only keep the elements that appear in both sets");
        System.out.println(intersection);

        System.out.println();//////////////////////////////////Difference

        Set<String> difference = new HashSet(hset);
        difference.removeAll(hset2);
        System.out.println("remove all the elements that overlap with hset2 and left with the unique elements");
        System.out.println(difference);
    }
}

