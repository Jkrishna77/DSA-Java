package com.binary;

import java.util.Arrays;

public class Q6FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;
    }

    public static int search(int[] arr, int target, boolean findFirstOccurence){

        int start = 0;
        int end = arr.length -1;
        int ans=-1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else{
                if(findFirstOccurence){
                    ans=mid;
                    end=mid-1;
                }else{
                    ans=mid;
                    start=mid+1;
                }
            }
        }
        return ans;

    }
}
