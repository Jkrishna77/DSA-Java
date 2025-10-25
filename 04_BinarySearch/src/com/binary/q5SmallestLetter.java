package com.binary;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class q5SmallestLetter {

    public static void main(String[] args) {
        int[] letters = {'c','f','j'};
        int target = 'f';
        int ans = binarySearchCeiling(letters, target);
        System.out.println(((char) ans));
    }

    static int binarySearchCeiling(int[] letters, int target) {
        int start = 0;
        int end = letters.length-1;

        while (start <= end){
            // find the middle element
            // int mid = (start + end) / 2;
            // to avoid integer overflow
            int mid = start + (end-start)/2;

            if(target < letters[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start% letters.length];
    }

}
