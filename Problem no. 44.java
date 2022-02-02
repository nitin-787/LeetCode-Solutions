// Ques: Sort Colors aka bubble sort 
// Ques Link: https://leetcode.com/problems/sort-colors/


// NOTE : While submitting on leetcode just remove the sawp part(comment below which one you have to remove) over there then it will work ...

package com.nitin;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;   // remove this line to submit in leetCode
            // for each step, max index will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped =true; // remove this line to submit in leetCode
                }
            }
            
            // if you did not swap for a particular value of i, it means array is sorted hence stop the program
            if (!swapped){ // !false = true    // remove this if part also to submit in leetCode
                break;   
            }
        }
    }
}

