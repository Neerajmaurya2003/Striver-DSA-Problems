package Important_Sorting_Techniques;

/*
 Problem Statement: Given an array of N integers, write a program to implement the Recursive Bubble Sort algorithm.

Examples:

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting we get 9,13,20,24,46,52

Example 2:
Input: N = 5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting we get 1,2,3,4,5
 */

public class Recursive_Bubble_Sort {

    //Recursive Bubble Sort Method
    static void RecursiveBubbleSort(int[] arr,int high ){
        if(high==1) return ;
        for (int i=0;i<high-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        RecursiveBubbleSort(arr, high-1);

    }


    
    public static void main(String[] args) {

        int [] arr = {13,46,24,52,20,9};
        System.out.println("Array Before Sorting is:");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        System.out.println();
       RecursiveBubbleSort(arr, arr.length);
        System.out.println("Array After Sorting is:");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        
    }
}
