package Problems_On_Arrays.Medium_Array;
/*
 Problem Statement: Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

Note: You are not allowed to use the same element twice. Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution
 
Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

Example 2:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
Result: NO (for 1st variant)
	[-1, -1] (for 2nd variant)
Explanation: There exist no such two numbers whose sum is equal to the target.

*/

import java.util.HashMap;

public class Two_Sum {

       //Method To Impliment insertion sort
    static void InsertionSort(int[] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){

            int j=i;
                while(j>0){
                    if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        j--;
                    }
                    else{
                        break;
                    }

                }
        }
    }

    //Using Brute force 1st Varient
    static String UsingBruteForce1stVarient(int[] arr,int target){
        int n=arr.length;

        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])==target){
                    return "Yes";
                }
            }
        }
        return "No";
    }

    //Using Brute force 2nd Varient
    static int[] UsingBruteForce2ndVarient(int[] arr,int target){
        int[] indices= {-1,-1};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])==target){
                    indices[0]=i;
                    indices[1]=j;
                }
            }
        }

        return indices;

        
    }


    //Using HashMap 1st varient
    static String UsingHashmap1stVarient(int[] arr,int target){

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int num =arr[i];
            int rest=target-num;
            if(map.containsKey(rest)){
                return "Yes";
            }

            map.put(arr[i], i);
        }

        return "No";
    }

    //Using HashMap 2nd Varient
    static int[] UsingHashmap2ndVarient(int[] arr,int target){
        int[] values={-1,-1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++) {
            int num=arr[i];
            int rest=target-num;
            if(map.containsKey(rest)){
                values[0]=map.get(rest);
                values[1]=i;
                break;
            }
            map.put(arr[i], i);
        }

        return values;
    }

    //Using Two Pointer Approch(Optimal Approch)
    static int[] UsingTwoPointer(int[] arr,int target){
        int[] values={-1,-1};
        int i=0,j=arr.length-1;
        InsertionSort(arr);
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                values[0]=i;
                values[1]=j;
                break;
            }
            else if(sum<target){
                i++;
            }
            else{
                j++;
            }

        }

        return values;
    }



    public static void main(String[] args) {
        int [] arr={2,6,5,8,11};
        int target=19;
     for (int i : UsingTwoPointer(arr, target)) {
        System.out.println(i);
     }
        
    }
    
}
