package Important_Sorting_Techniques;

/*
 Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.

Examples:

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting we get 9,13,20,24,46,52


Input: N = 5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting we get 1,2,3,4,5
 */

public class Bubble_Sort {

    //Method to Impliment Bubble Sort 
    //Time Complexity is O(N^2)
    static void BubbleSort(int[] arr){

        int n=arr.length;
        for(int i=0;i<n;i++){
            //To Monitor swap
            //If no swap occur Array is sorted and we doesn't need to iterate
            int didswap=0;

            for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                didswap=1;
            }
           
            }
             if(didswap==0){
                break;
            }
        }
    }


    public static void main(String[] args) {
        int [] arr = {13,46,24,52,20,9};
        System.out.println("Array Before Sorting is:");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        System.out.println();
        BubbleSort(arr);
        System.out.println("Array After Sorting is:");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
    }
    
}
