package com.sort;

// https://leetcode.com/problems/missing-number/

public class Q5_MissingNumber {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {

        int i=0;
        while(i<arr.length){
            if(arr[i]<arr.length && arr[i]!=i){
                swap(arr, i, arr[i]);
            }else{
                i++;
            }
        }

        for(int j =0; j<arr.length; j++){
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
