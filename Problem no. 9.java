// Ques Link : https://leetcode.com/problems/palindrome-number/submissions/

// Ques : Palindrome Number

package com.nitin;

public class isPlaindrome {
    public static void main(String[] args) {
        int num = 101;
        System.out.println(Palindrome(num));
    }

    static boolean Palindrome(int num) {
        if (num < 0) {
            return false;
        }
        int x = num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num/10;
        }
        return x == sum;
    }
}