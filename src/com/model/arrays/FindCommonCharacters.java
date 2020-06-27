package com.model.arrays;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class FindCommonCharacters {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] str = new String[2];
        String a,b;
        int count =0;
        System.out.println("Enter two strings:");
        str = sc.nextLine().split(" ");
        a = str[0];
        b = str[1];
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        for(int i=0;i<x.length;i++){
            if(x[i] == y[i]){
                count++;
            }
        }
        System.out.println("Common likes and dislikes :"+count);


    }


}
