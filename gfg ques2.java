// Ques: Find the Rotation Count in Rotated Sorted array

// Ques Link: https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

package com.nitin;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,0,1,2,3,};
        System.out.println(CountRotations(arr));
    }

    private static int CountRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <=end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid  + 1;
            }
        }
        return - 1;
    }
}

