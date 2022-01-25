// Ques: Find First and Last Position of Element in Sorted Array

// Ques Link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package com.nitin;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println("First Index of " + target + ": " +  search(nums, target, true));
        System.out.println("last Index of " + target + ": " + search(nums, target, false));

    }

    // this function just returns the index value of target
   static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

