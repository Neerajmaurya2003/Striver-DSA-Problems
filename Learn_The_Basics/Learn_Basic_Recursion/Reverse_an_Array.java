package Learn_Basic_Recursion;

import java.util.Arrays;
import java.util.Collections;

/*
 Problem Statement: You are given an array. The task is to reverse the array and print it. 

Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
 */

public class Reverse_an_Array {

//By Using Extra Space
static int[] ReverseArray(int[] arr){
    int[] ans=new int[arr.length];

    for(int i=0;i<arr.length;i++){
        ans[i]=arr[arr.length-i-1];
    }

    return ans;

}

//Without usig Extra Space

static int[] ReverseArrayWithoutExtraSpace(int[] arr){

    for(int i=0;i<arr.length/2;i++){
        int temp=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
    }
    return arr;
}

//By Using Recursive Method
static void ReverseArrayRecursive(int[] arr,int start,int end){
if (start<end) {
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    ReverseArrayRecursive(arr, start+1, end-1);
}
}

//By Using inbuilt Library
static void ReverseArrayLibrary(Integer arr[]){

    Collections.reverse(Arrays.asList(arr)); 
}


    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5};
        ReverseArrayLibrary(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
    
}
