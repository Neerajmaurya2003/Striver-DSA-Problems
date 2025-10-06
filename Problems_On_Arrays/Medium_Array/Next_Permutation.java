package Problems_On_Arrays.Medium_Array;
import Problems_On_Arrays.Easy_Array.Rotate_Array_By_K_Element;

/*
 Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).

Example 1 :

Input format: Arr[] = {1,3,2}
Output: Arr[] = {2,1,3}
Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.
Example 2:

Input format: Arr[] = {3,2,1}
Output: Arr[] = {1,2,3}
Explanation: As we see all permutations of {1,2,3}, we find {3,2,1} at the last position. So, we have to return the topmost permutation.

 */

public class Next_Permutation {

    //Optimal Solution
    static int[] NextPermutation(int[] arr){
        int n =arr.length;
        int i=n-2;
        while (i>=0 && arr[i]>=arr[i+1]) i--;
        if(i>=0){
            int j=n-1;
            while (arr[j]<=arr[i])j--;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        Rotate_Array_By_K_Element.ReverseArray(arr, i+1, n-1);
        return arr;
    }

    

    public static void main(String[] args) {
    int[] arr={1,2,3};    
    for (int i : NextPermutation(arr)) {
        System.out.println(i);
    }
    }
}
