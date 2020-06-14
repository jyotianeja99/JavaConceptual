package com.model.arraylist;

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String args[]) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("America");
        countries.add("Bangladesh");
        countries.add("China");
        countries.add("Denmark");
        countries.add("Germany");
        countries.add("India");
        countries.add("Japan");
        countries.add("Malasia");
        System.out.println("Original countries order: " + countries);

        ArrayList<String> countriesReversed = new ArrayList<>();

        //reverse order of countries
        for (int i = countries.size() - 1; i >= 0; i--) {
            countriesReversed.add(countries.get(i));
        }

        System.out.println("Reversed order of countries: " + countriesReversed);

    }


}
