package com.sort;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class Q6_MissingNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
//        System.out.println(Arrays.toString(nums));
    }

    public static ArrayList<Integer> findDisappearedNumbers(int[] arr) {

        int i=0;
        while(i<arr.length){
            int correct= arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int j =0; j<arr.length; j++){
            if(arr[j] != j+1){
                result.add(arr[j]);
            }
        }
        return result;

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
