package com.model.predicate;

import java.util.function.Predicate;

public class LengthOfString {
    public static void main(String args[]){
        Predicate<String> ptr = s -> s.length() > 5;
        //System.out.println(ptr.test("jyotianeja"));

        String[] s = {"Nag", "Chiranjeevi", "Raja Rajput","Hey", "Jyoti Aneja One"};
        String[] newStrngs = new String[s.length];
        int n =0;
        for(int i=0;i<s.length;i++){
            if(ptr.test(s[i])){
                System.out.println(s[i]);
            }
        }












    }
}
