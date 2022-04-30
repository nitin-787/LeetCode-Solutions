// we already have sorted arrays and just we are merging both of the arrays

package com.nitin;

import java.util.Arrays;

public class MergeSort1 {
    public static void main(String[] args) {
        int[] num1 = {3, 4, 7};
        int[] num2 = {5, 9, 12};

        int[] ans = mergeSort(num1, 0, num2, 0);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] num1, int n, int[] num2, int m) {
        int[] num3 = new int[num1.length + num2.length];

        n = 0;
        m = 0;
        int k = 0;

        while (n < num1.length && m < num2.length) {

            if (num1[n] < num2[m]) {
                num3[k] = num1[n];
                n++;
            } else {
                num3[k] = num2[m];
                m++;
            }

            k++;

            while (n < num1.length) {
                num3[k] = num1[n];
                n++;
                k++;
            }

            while (m < num2.length) {
                num3[k] = num2[m];
                m++;
                k++;
            }
        }

        return num3;
    }
}
