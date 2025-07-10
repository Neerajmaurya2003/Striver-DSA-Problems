package Problems_On_Arrays.Easy_Array;
/*
 Problem Statement: Given an array of N integers, left rotate the array by one place.

Examples

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1
Explanation: 
Since all the elements in array will be shifted 
toward left by one so ‘2’ will now become the 
first index and and ‘1’ which was present at 
first index will be shifted at last.


Example 2:
Input: N = 1, array[] = {3}
Output: 3
Explanation: Here only element is present and so 
the element at first index will be shifted to 
last index which is also by the way the first index.
 */

public class Left_Rotate_The_Array_By_One {

    //Optimal Technique
    //Time Complexity O(N)
    static void UsingOptimalApproch(int[] arr){
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        UsingOptimalApproch(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
}
