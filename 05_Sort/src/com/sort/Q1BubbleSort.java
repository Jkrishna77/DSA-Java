package com.sort;

import java.util.Arrays;

public class Q1BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 6, 2, 8};
        System.out.println("Before sort: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After sort: " + Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
