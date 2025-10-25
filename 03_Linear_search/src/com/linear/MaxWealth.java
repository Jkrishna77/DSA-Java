package com.linear;
// https://leetcode.com/problems/richest-customer-wealth/description/
public class MaxWealth {
    public static void main(String[] args) {

        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));



    }
    static int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] persons : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int acnt : persons) {
                sum += acnt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
