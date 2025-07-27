package Problems_On_Arrays.Medium_Array;


/*
 Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray.

Example 1:

Input: arr = [-2,1,-3,4,-1,2,1,-5,4] 

Output: 6 

Explanation: [4,-1,2,1] has the largest sum = 6. 

Examples 2: 

Input: arr = [1] 

Output: 1 

Explanation: Array has only one element and which is giving positive sum of 1.
 */

public class Kadanes_Algorithm_Maximm_Subarray_Sum_in_an_Array {


    //Optimal Approch(O(N))
    static void UsingOptimalApproch(int[] arr){
        int sum=0;
        int maxsum=0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            maxsum=Math.max(maxsum, sum);

             if(sum<0) sum=0;
        }
        System.out.println(maxsum);
    }

  //Using Brute Force(O(N^3))
  static void UsingBruteForce(int[] arr){
    int maxsum=0;

    for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
            int sum=0;

            for (int index = i; index < j; index++) {
                sum +=arr[index];
            }
            maxsum=Math.max(maxsum, sum);

        }
    }
    System.out.println(maxsum);

  }

  //Better Approch(O(N^2))
  static void UsingBetterApproch(int[] arr){
    int maxsum=0;
    for (int i = 0; i < arr.length; i++) {
        int sum=0;
        for (int j = i; j < arr.length; j++) {
            sum+=arr[j];
            maxsum=Math.max(maxsum, sum);
        }
    }
    System.out.println(maxsum);
  }



    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        UsingOptimalApproch(arr);
    }
    
}
