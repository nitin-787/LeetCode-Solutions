// Ques : Flipping an image 
// Ques Link : https://leetcode.com/problems/flipping-an-image/

package com.nitin.bitwise;

import java.util.Arrays;

public class flipImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] ans = flipAndInvertImage(arr);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] flipAndInvertImage(int[][] arr) {
        for (int[] row: arr) {
            // reverse this array
            for (int i = 0; i < (arr[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[arr[0].length - i - 1] ^ 1;
                row[arr[0].length - i - 1] = temp;
            }
        }
        return arr;
    }
}