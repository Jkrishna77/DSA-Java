package com.binary;

/*

 In a array [3,5,7,9] if we have match regular binary search provides answer. In some cases we need to find
 closest small or higher value to the required value

 when we use two pointers we expect answer to be in between them like : start ans end
 But that loop breaks when lower pointer crosses higher pointer, then it becomes : end ans start
 so clearly end will have closest small number to the answer and start will be holding closest greater number

 Edge Case: what if target value is greater than last element in array return -1
*/

public class Q3Ceiling {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 23;
        int ans = binarySearchCeiling(arr, target);
        System.out.println(ans);
    }

    // return the index
    // if not found return start which will hold nearest greater number
    static int binarySearchCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        if (target > arr[end]){
            return -1;
        }

        while (start <= end){
            // find the middle element
            // int mid = (start + end) / 2;
            // to avoid integer overflow
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        // not found return ceiling number
        return start;
    }
}
