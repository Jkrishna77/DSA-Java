package com.refactorpatterns;

import java.util.Arrays;

public class Recursion_selection_sort {
    public static void main(String[] args) {
        int[] arr1={4,3,2,1};
        selection(arr1, arr1.length-1,0,0);
        System.out.println(Arrays.toString(arr1));
    }

    static void selection(int arr[], int r, int c, int max){
        if(r==0){
            return;
        }

        if(r>=c){
            if(arr[c]>arr[max]){
                selection(arr, r, c+1,c);
            }else{
                selection(arr, r, c+1,max);
            }

        }else{
            int temp = arr[max];
            arr[max] = arr[r];
            arr[r] = temp;
            selection(arr, r-1, c=0,0);
        }
    }


}
