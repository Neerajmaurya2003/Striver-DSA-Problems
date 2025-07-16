package Problems_On_Arrays.Easy_Array;
/*
 Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

Examples:

Example 1:

Input: prices = {1, 1, 0, 1, 1, 1}

Output: 3

Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

Input: prices = {1, 0, 1, 1, 0, 1} 

Output: 2

Explanation: There are two consecutive 1's in the array.
 */

public class Count_Maximum_Consecutive_Ones {

    static int CountMaximumConsecutiveOnes(int[] arr){
        int count=0;
        int max=0;
        for (int i : arr) {
            if(i==1){
                count++;
                if(count>max) max=count;
            }
            else count=0;
            
        }
        return max;
    }


    public static void main(String[] args) {
        int [] arr={1, 0, 1, 1, 0, 1} ;

        System.out.println(CountMaximumConsecutiveOnes(arr));
    }
    
}
