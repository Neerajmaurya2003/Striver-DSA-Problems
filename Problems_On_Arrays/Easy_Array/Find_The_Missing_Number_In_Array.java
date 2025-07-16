package Problems_On_Arrays.Easy_Array;

/*
 Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.

Example 2:
Input Format: N = 3, array[] = {1,3}
Result: 2
Explanation: In the given array, number 2 is missing. So, 2 is the answer.

 */

public class Find_The_Missing_Number_In_Array {



    //Optimal Solution(Works Only for sorted natural numbers starting from 1)
    static int FindElementBruteForce(int[] arr, int n){
        int element=-1;

        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                element=i+1;
                break;
            }
        }
         
        return element;
    }

    //Optimal solution(Works on Both sorted And UnSorted Array )
    static int FindElementUsingSum(int[] arr,int n){
        int sum=(n*(n+1))/2;
        int arraysum=0;
        for (int i : arr) {
            arraysum=arraysum+i;
        }
        return sum-arraysum;
    }





    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=5;
        System.out.println(FindElementUsingSum(arr, n));

    }
    
}
