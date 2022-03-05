// Ques: Power of Two
// Ques Link: https://leetcode.com/problems/power-of-two/

package com.nitin.bitwise;

public class PowerofTwo {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n) {
          boolean ans = n > 0 && (n & (n - 1)) == 0;
          return ans;
    }
    
    // Note: if you somehow found this solution, can you please tell me why the solution, I written below why is not working wheather the upper one is working correctly. Let's me know please or (I'll find the ans on my own till you reach to this repo :) peace xD
    // static boolean isPowerOfTwo(int n) {
    //     if (n == 0) {
    //         return true;
    //     }
    //     boolean ans = (n & (n - 1)) == 0;
    //     return ans;
    // }
}
