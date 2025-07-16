package Problems_On_Arrays.Easy_Array;

/*
 Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.
 Examples:

Example 1:
Input: arr[]= 1 2 3 4 5, num = 3
Output: 2
Explanation: 3 is present in the 2nd index

Example 2:
Input: arr[]= 5 4 3 2 1, num = 5
Output: 0
Explanation: 5 is present in the 0th index
 */

public class Linear_Search {

    //Linear Search
    static void LinearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target){
                System.out.println(arr[i]+" Is Found at "+i+" Index:");
                return;
            }
        }
        System.out.println("Element Not Found");

    }


    public static void main(String[] args) {
        int[] arr={ 1, 2, 3, 4, 5};
        LinearSearch(arr,10);
    }
    
}
