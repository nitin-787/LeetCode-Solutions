// Ques: 744. Find Smallest Letter Greater Than Target
// Ques link - https://leetcode.com/problems/find-smallest-letter-greater-than-target/

package com.nitin;
//Q: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        char ans = ceiling(letters, target);
        System.out.println(ans);
    }

    // return the index of the smallest no > target
    static char ceiling(char[] letters, char target){

        // but what if the target is greater than the greatest number in the array

        int start = 0;
        int end = letters.length -1;

        while(start <= end){
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that the (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}