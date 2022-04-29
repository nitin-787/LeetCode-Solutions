// we have 2 arrays sorted but arrays num1 contain 0s at the end of sorted elements.
// so i just removed 0s from end and inserted the 2nd array. 

package com.nitin;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] num1 = {2, 4, 6, 0, 0, 0};
        int[] num2 = {8, 9, 12};

        int[] ans = mergeSort(num1, 0, num2, 0);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] num1, int n, int[] num2, int m) {

        n = 0;
        m = 0;

        while (n < num1.length) {
            if (num1[n] == 0) {
                int temp = num1[n];
                num1[n] = num2[m];
                num2[m] = temp;
                m++;
            }
            n++;
        }

        return num1;
    }
}
