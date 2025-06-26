package Important_Sorting_Techniques;

/*
 Problem Statement: Given an array of N integers, write a program to implement the Recursive Insertion Sort algorithm.
Examples:

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting we get 9,13,20,24,46,52

Example 2:
Input: N = 5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting we get 1,2,3
 */

public class Recursive_Insertion_Sort {

    //Recursive Insertion Sort
    static void RecursiveInsertionSort(int[] arr,int n,int i){
        if(i==n) return;

        for(int j=i;j>0;j--){
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
            }
            
            RecursiveInsertionSort(arr, n, i+1);
    }



    public static void main(String[] args) {

         int [] arr = {13,46,24,52,20,9};
        System.out.println("Array Before Sorting is:");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        System.out.println();
       RecursiveInsertionSort(arr, arr.length, 1);
        System.out.println("Array After Sorting is:");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        
    }
    
}
