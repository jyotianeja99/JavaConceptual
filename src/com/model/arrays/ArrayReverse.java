package com.model.arrays;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int j =0;
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        reverseArr(arr,n);

    }

    private static void reverseArr(int[] arr,int length) {
        for(int i = 0;i<length/2;i++){
            int temp = arr[i];
            arr[i] = arr[length-1-i];
            arr[length-1-i] = temp;
        }

        for(int i=0;i<length;i++){
            System.out.print(arr[i]+ " ");
        }


    }

}
