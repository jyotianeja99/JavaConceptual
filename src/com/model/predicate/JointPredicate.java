package com.model.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class JointPredicate {
    public static void main(String args[]){
        Predicate<Integer> p = i -> i%2 ==0;
        Predicate<Integer> pp = j -> j>200;
        List<Integer> numbers = Arrays.asList(35,56,100,450,248,350,980,800,125,5678);

        //Joint predicate interesting- observe the syntax
        //find all numbers which are even and greater than 200

        for(Integer i : numbers){
            if(p.and(pp).test(i)){
                System.out.print(i+ " ");
            }
        }















    }
}
