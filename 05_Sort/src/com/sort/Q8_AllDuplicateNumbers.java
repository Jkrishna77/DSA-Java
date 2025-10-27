package com.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Q8_AllDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(arr));



    }

    static ArrayList<Integer> findDuplicates(int[] arr) {

        int i = 0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);

            }else{
                i++;
            }
        }

        ArrayList<Integer> res=new ArrayList<>();
        for(int j=0; j< arr.length; j++){
            if(arr[j] != arr[j]+1){
                res.add(arr[j]);
            }
        }
        return res;

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



}
