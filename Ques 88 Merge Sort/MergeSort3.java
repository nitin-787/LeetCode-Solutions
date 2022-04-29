// it is the combined solution of MergeSort 1 and MergeSort 2 in given folder
// if arrays 1 dose'nt contain zero's at end then it will work and if there is no zero at end then it'll 
// also work.

package com.nitin;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // int[] num1 = {2, 4, 6}
        int[] num1 = {2, 4, 6, 0, 0, 0};
        int[] num2 = {8, 9, 12};

        int[] ans = mergeSort(num1, 0, num2, 0);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] num1, int n, int[] num2, int m) {

        n = 0;
        m = 0;
        int k = 0;

        boolean bool = false;

        while (n < num1.length) {
            if (num1[n] == 0) {
                int temp = num1[n];
                num1[n] = num2[m];
                num2[m] = temp;
                m++;
                bool = true;
            }
            n++;
        }

        if (bool) {
            return num1;
        } else {
            n = 0;

            int[] num3 = new int[num1.length + num2.length];

            while (n < num1.length) {
                num3[k] = num1[n];
                n++;
                k++;
            }

            while (m < num2.length) {
                num3[k] = num2[m];
                k++;
                m++;
            }

            return num3;
        }
    }
}
