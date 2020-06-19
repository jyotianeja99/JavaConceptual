package com.model.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String args[]){
        Set<String> hset = new HashSet<>();
        hset.add("Jyoti");
        System.out.println(hset.add("Jyoti")); //returns false as it is already present.
        System.out.println(hset.add("Aneja")); //returns true
        System.out.println(hset);



        Map<String,String> hs = new HashMap<>();
        hs.put("Amarjeet","Mehendiratta");
        hs.put("Hridya","Aneja");
        hs.put("Jyoti","Girl");
        System.out.println(hs.put("Jyoti", "Aneja")); //"Jyoti is already present as a key in map.
                                                      //so it will return value "Girl"
                                                      //if a key is already present in the map,
                                                      //it will return the previous value binded to it.







    }
}
