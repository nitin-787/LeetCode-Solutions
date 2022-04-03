// Ques link : https://leetcode.com/problems/number-of-1-bits/
// Ques : Number of  1 bits 

package com.nitin.bitwise;

public class bits {
    public static void main(String[] args) {
        int n = 1110111010;
        int ans = bits(n);
        System.out.println(ans);
    }

    static int bits(int n) {
        int count = 0;
        for (int i = 1; i <= 32; i++) {
            if (((n >> i) & 1) == 1) {
                count++;
            }
        }
        return count;
    }
}

