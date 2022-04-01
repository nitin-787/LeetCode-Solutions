// Ques Link : https://leetcode.com/problems/reverse-string/
// Ques : Reverse String

package com.nitin;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Reverse(char[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}