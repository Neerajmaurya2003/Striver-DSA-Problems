package Problems_On_Arrays.Medium_Array;

/*
 Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray.(Simply print the subarray with maximum sum)
Example 1:

Input: arr = [-2,1,-3,4,-1,2,1,-5,4] 

Output: 6 

Explanation: [4,-1,2,1] has the largest sum = 6. 

Examples 2: 

Input: arr = [1] 

Output: 1 

Explanation: Array has only one element and which is giving positive sum of 1.
 */

public class Kadanes_Algorithm_Extended_Version {


    //Using Brute Force
    static void UsingBruteForce(int [] arr){
        int maxsum=0;
        int l=0,r=arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                }
                if(sum>maxsum){
                    maxsum=sum;
                    l=i;
                    r=j;
                }
            }
        }
       ShowSumAndSubArray(maxsum, arr, l, r);

    }

    //Method to Print MaxSum And SubArray
    static void ShowSumAndSubArray(int maxsum,int[] arr,int l, int r){
        System.out.println("Maximum Sum is: "+maxsum);
        System.out.println("And SubArray is:");
        for (int i = l; i <r; i++) {
            System.out.println(arr[i]);
        }
    }


    //Using Better Approch
    static void UsingBetterApproch(int[] arr){
        int maxsum=Integer.MIN_VALUE,l=0,r=arr.length;

        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum +=arr[j];
                if(sum>maxsum){
                    maxsum=sum;
                    l=i;
                    r=j+1;
                }
            }
        }
        ShowSumAndSubArray(maxsum, arr, l, r);
    }

    //Using Optimal Approch
    static void UsingOptimalApproch(int[] arr){
        int maxsum=Integer.MIN_VALUE,l=0,r=arr.length;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum>maxsum){
                maxsum=sum;
                r=i+1;
            }
            if(sum<0) {
                sum=0;
                l=i+1;
            }
        }

        ShowSumAndSubArray(maxsum, arr, l, r);

    }



    public static void main(String[] args) {
        int[] arr={-2, -3, 4, -1, -2, 1, 5, -3};
        UsingOptimalApproch(arr);
        
    }
    
}
