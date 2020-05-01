package com.company;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Main a =  new Main();

        double x = 150.05;
        int y = (int) x;
        System.out.println(y);
        //variable to variable casting
        //Cuts off the decimal and DOES NOT ROUND
        //DONT CAST A LARGER RANGE DATA TYPE DOWN

        Integer wholeNumber = 400;
        int wholeNumber2 = wholeNumber.intValue();
        System.out.println(wholeNumber2);
        //object to variable

        String val = "47";      //Only works if the string contains numbers
        int intObject = Integer.parseInt(val);
        System.out.println(intObject);

    }
}
