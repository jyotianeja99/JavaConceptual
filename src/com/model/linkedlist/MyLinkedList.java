package com.model.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String args[]){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Jyoti");
        linkedList.add("Norin");
        linkedList.add("Chhavi");
        linkedList.add("Suman");
        linkedList.add("Navdeep");
        linkedList.add("Prakhar");
        linkedList.add("Ravleen");
        System.out.println(linkedList);

        boolean hasElement = linkedList.contains("Chhavi");
        System.out.println("Chhavi is present in the list :"+hasElement);

        linkedList.add(0,"Tanu");
        System.out.println(linkedList);

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("JUnit");

        linkedList.addAll(list); //adding whole collection arraylist.
        System.out.println(linkedList);

        linkedList.addAll(linkedList); //adding same collection, all elements will be repeated.
        System.out.println(linkedList);

        String fElement = linkedList.pop();
        System.out.println("Fist element is :"+fElement);

        String firstElement = linkedList.pollFirst();
        System.out.println("PollFirst() is :"+firstElement);

        String lElement = linkedList.pollLast();
        System.out.println("Last element is :"+lElement);

    }


}
