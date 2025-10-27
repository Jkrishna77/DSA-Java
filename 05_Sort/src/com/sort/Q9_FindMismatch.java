package com.sort;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/description/
public class Q9_FindMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};

        System.out.println(findErrorNums(arr));
//        findErrorNums(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // create result array of size 2
        int[] res = new int[2];

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                res[0] = arr[j];     // duplicate number
                res[1] = j + 1;      // missing number
                break;
            }
        }

        return res;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
