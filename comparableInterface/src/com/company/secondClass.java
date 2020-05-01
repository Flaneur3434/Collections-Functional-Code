package com.company;
import java.awt.*;
import java.util.*;

public class secondClass implements Comparable <secondClass>{
    String firstName;
    String lastName;
    String slavesName;
    secondClass(String firstName, String lastName, String slavesName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.slavesName = slavesName;
    }

    @Override
    //this method sorts by the lastname, but if the lastname is the same, it will
    //sort by the first name
    public int compareTo(secondClass sc){
        //Sorting by last name, compareTo should return < 0 if this(keyword)
        //is supposed to be less than sc, > 0 if this is supposed to be
        //greater than object sc and 0 if they are supposed to be equal

        int last = this.lastName.compareTo(sc.lastName);
        return last == 0 ? this.firstName.compareTo(sc.firstName) : last;
        // last == 0 is tested, if true this.firstName.compareTo(sc.firstName)
        // if false last
    }
}
