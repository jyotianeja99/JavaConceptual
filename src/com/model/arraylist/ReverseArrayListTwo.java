package com.model.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayListTwo {
    public static void main(String args[]) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Chikoo");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("Original order of fruits :" + fruits);
        System.out.println("Reversing order of fruits by our own method:");
        for (int i = 0; i < fruits.size() / 2; i++) {  //here no new arraylist is constructed.
            String fruit = fruits.get(i);
            fruits.set(i, fruits.get(fruits.size() - 1 - i));
            fruits.set(fruits.size() - i - 1, fruit);
        }
        System.out.println("Fruits in Reversed order: " + fruits);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        System.out.println("Original order: " + numbers);
        Collections.reverse(numbers);  //using Collections utility method.
        System.out.println("Reversed list of numbers: " + numbers);


    }


}
