package com.model.concepts;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListComparator {
    public static void main(String args[]){
        List list =new LinkedList<Integer>();
        list.add(-8);
        list.add(10);
        list.add(-20);
        list.add(null);
        Comparator<Integer> r = Collections.reverseOrder(); //Observe the run time error. "Null Pointer Ex"
        Collections.sort(list,r);
        for(Object i:list){
            System.out.println(i+ " ");

        }

    }
}
