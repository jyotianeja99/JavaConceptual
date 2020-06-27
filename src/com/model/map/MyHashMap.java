package com.model.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String args[]){
//        Set<String> hset = new HashSet<>();
//        hset.add("Jyoti");
//        System.out.println(hset.add("Jyoti")); //returns false as it is already present.
//        System.out.println(hset.add("Aneja")); //returns true
//        System.out.println(hset);



        Map<String,String> hs = new HashMap<>();
        hs.put("Amarjeet","Mehendiratta");
        hs.put("Hridya","Aneja");
        System.out.println("Can Jyoti be entered in map: "+(hs.put("Jyoti","Girl") == null));

        System.out.println("Second insertion of Jyoti :"+(hs.put("Jyoti", "Aneja") == null));

    }
}
