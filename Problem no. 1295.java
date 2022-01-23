// Ques : 1295. Find Numbers with Even Number of Digits
// Ques Link : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/ 

package com.nitin;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 54, 454, 54};
        System.out.println(findNumbers(nums));

//        System.out.println(digits2(23232));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)) {
                count++;
            }

        }
        return count;
    }

    // function to check wheather a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
       /*
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
        */
        return numberOfDigits % 2 == 0;
    }

    // count the number of digit in a number

    static int digits(int num) {

        // convert the from negative to positive
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num/10; // num /= 10;
        }
        return count;
    }

//    Another way  to count the number of digit in a number
    static int digits2(int num){

        if (num < 0) {
            num = num * -1;
        }

        return (int) (Math.log10(num)) + 1;
    }
}
