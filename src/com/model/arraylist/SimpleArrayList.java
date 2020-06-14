package com.model.arraylist;

import java.util.ArrayList;

public class SimpleArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(25);
        for (int i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println("\nAfter more addition:");

        arrayList.add(30);
        arrayList.add(35);
        arrayList.add(40);
        arrayList.add(45);
        arrayList.add(50); //takes argument element
        arrayList.remove(2); //takes argument index.
        arrayList.add(0, 1000); //takes index and actual object to be added.

        System.out.println(arrayList);

    }


}
