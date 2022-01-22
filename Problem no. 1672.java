// Ques: 1672. Richest Customer Wealth
// Ques Link - https://leetcode.com/problems/richest-customer-wealth/ 

package com.nitin;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 3, 3},
                {4, 3, 2}
        };

//        maximumWealth(accounts);
        System.out.println("Maximum wealth is " + maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        // accounts = col
        // person = row
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }

        // we can take out here as well
        System.out.println(ans);
        return ans;
    }
}
