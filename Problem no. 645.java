// Ques : Set Mis-match 

// Ques Link : https://leetcode.com/problems/set-mismatch/ 

package com.nitin;

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 2, 6, 5};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index + 1};
            }
        }
        return new int[] {-1, -1};
    }

   public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
