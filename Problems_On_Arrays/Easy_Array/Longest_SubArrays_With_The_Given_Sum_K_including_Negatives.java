package Problems_On_Arrays.Easy_Array;

import java.util.HashMap;

/*
 Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 3, k = 1, array[] = {-1, 1, 1}
Result: 3
Explanation: The longest subarray with sum 1 is {-1, 1, 1}. And its length is 3.
 */

public class Longest_SubArrays_With_The_Given_Sum_K_including_Negatives {



    //Using HashMap
    static void UsingHashMap(int[] arr,int k){
        long sum=0;
        int maxlen=0;
        HashMap<Long,Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum==k) {
                maxlen=Math.max(maxlen, i+1);
            }
            long rem=sum-k;
            if(map.containsKey(rem)){
                maxlen=Math.max(maxlen, i-map.get(rem));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        System.out.println(maxlen);

    }



    public static void main(String[] args) {
        int[] arr={2,3,5};
        UsingHashMap(arr, 5);
        
    }
    
}
