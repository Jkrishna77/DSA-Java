package com.refactorpatterns;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Recursion_bubble_sort {
    public static void main(String[] args) {
        int[] arr1={4,3,2,1};
        bubble(arr1, arr1.length-1,0);
        System.out.println(Arrays.toString(arr1));
    }

    static void bubble(int arr1[], int r, int c){
        if(r==0){
            return;
        }

        if(r>c){
            if(arr1[c]>arr1[r]){
                int temp = arr1[c];
                arr1[c] = arr1[r];
                arr1[r] = temp;

            }
            bubble(arr1, r, c+1);
        }else{
            bubble(arr1, r-1, c=0);
        }
    }


}
