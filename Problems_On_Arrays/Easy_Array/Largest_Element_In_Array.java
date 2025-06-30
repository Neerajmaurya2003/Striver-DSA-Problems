package Problems_On_Arrays.Easy_Array;

/*
 Problem Statement: Given an array, we have to find the largest element in the array.


Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array.
 */

public class Largest_Element_In_Array {


    //Optimum Solution
    //Time Complexity O(N)
    static int LargestElement(int[] arr){

        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }

        return max;
    }



    public static void main(String[] args) {
        int [] arr={2,5,1,3,0};
        System.out.println(LargestElement(arr));
    }
    
}
