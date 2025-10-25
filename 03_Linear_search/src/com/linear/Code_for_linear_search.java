package com.linear;

public class Code_for_linear_search {

    static int linearSearch(int arr[], int key){
        if (arr.length ==0){
            return -1;
        }

        for (int i=0; i< arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        int result = linearSearch(arr, key);
        if (result == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    
}
