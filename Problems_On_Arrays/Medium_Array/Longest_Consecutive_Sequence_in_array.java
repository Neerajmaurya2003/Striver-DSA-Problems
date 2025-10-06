package Problems_On_Arrays.Medium_Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Problem Statement: You are given an array of ‘N’ integers. You need to find the length of the longest sequence which contains the consecutive elements.

Example 1:

Input: [100, 200, 1, 3, 2, 4]

Output: 4

Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.

Input: [3, 8, 5, 7, 6]

Output: 4

Explanation: The longest consecutive subsequence is 5, 6, 7, and 8. 

 */

public class Longest_Consecutive_Sequence_in_array {

    static void LongestCnsecutiveSequenceInArray(int[] arr){
        int n =arr.length;
        Set<Integer> set=new HashSet<>() ;

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int maxcount=1;
        for (Integer integer : set) {
            if(!set.contains(integer-1)){
                int count=1;
                int x=integer;
                while (set.contains(x+1)) {
                    count++;
                    x=x+1;
                }
                maxcount=Math.max(maxcount, count);
            }

        }

        System.out.println(maxcount);
    }
    
    public static void main(String[] args) {
        int[] arr={3, 8, 5, 7, 6};
        LongestCnsecutiveSequenceInArray(arr);
    }
}
