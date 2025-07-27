package Problems_On_Arrays.Easy_Array;

import java.util.HashMap;

/*
 Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3
 */

public class Longest_SubArrays_With_The_Given_Sum_K {


   
    // Using Two Pointers(Optimal)
    static void UsingTwoPointers(int[] arr,int k){
        int n=arr.length;
        int p1=0,p2=0;
        int maxlen=0;
        int sum=arr[0];

        while (p2<n) {

            while (p1<=p2 && sum>k ) {
                sum -= arr[p1];
                p1++;
            }
            
            if(sum==k){
                maxlen=Math.max(maxlen, p2-p1+1);
            }
            p2++;
            if( p2<n) sum +=arr[p2];

        }
        System.out.println(maxlen);

    }

    //Using HashMap
    static void UsingHashMap(int[] arr,int k){
        
        long sum=0;
        int maxLength=0;
        HashMap<Long,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
           
           if(sum==k){
            maxLength=Math.max(maxLength, i+1);
           }
           long rem=sum-k;

           if(map.containsKey(rem)){
            maxLength=Math.max(maxLength,i- map.get(rem));
           }

           if(!map.containsKey(rem)){
            map.put(sum, i);
           }

        }
        System.out.println(maxLength);

    }




    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        UsingHashMap(arr,10);
        
    }
    
}
