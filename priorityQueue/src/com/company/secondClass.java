package com.company;
import java.awt.*;
import java.util.*;

public class secondClass implements Comparator<String>{
    @Override
    public int compare(String x, String y){
        return x.length() - y.length();
    }
}
