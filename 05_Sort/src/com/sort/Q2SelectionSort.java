package com.sort;

import java.util.Arrays;

public class Q2SelectionSort {
    public static void main(String[] args){
        int[] arr = {5, 3, 4, 1, 2};
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i =0; i< arr.length -1 ; i++){
            int last= arr.length -1 -i;
            int max=maxIndex(arr,0,last);
            swap(arr, max, last);
        }
    }
    static int maxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
