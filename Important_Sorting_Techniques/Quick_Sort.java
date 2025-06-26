package Important_Sorting_Techniques;

/*
 Problem Statement:  Given an array of n integers, sort the array using the Quicksort method.

Examples:

Example 1:
Input:  N = 5  , Arr[] = {4,1,7,9,3}
Output: 1 3 4 7 9 

Explanation: After sorting the array becomes 1, 3, 4, 7, 9

Example 2:
Input: N = 8 , Arr[] = {4,6,2,5,7,9,1,3}
Output: 1 2 3 4 5 6 7 9
Explanation: After sorting the array becomes 1, 3, 4, 7, 9
 */

public class Quick_Sort {

    //Method to Impliment Quick Sort
    static void QuickSort(int [] arr,int low,int high){

        if(low<high){
            int j=Partition(arr, low, high);
            QuickSort(arr, low, j);
            QuickSort(arr, j+1, high);
        }

    }

    //Method to find Pivot 
    static int Partition(int[] arr,int low,int high){

        int i=low;
        int j=high;
        while(i<j){
            while (arr[i]<arr[low]){
                i++;
            }
            while (arr[j]>arr[low]){
                j--;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;

    }


    public static void main(String[] args) {

        
         int [] arr = {13,46,24,52,20,9};
        System.out.println("Array Before Sorting is:");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        System.out.println();
        QuickSort(arr, 0, arr.length-1);
        System.out.println("Array After Sorting is:");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        
    }
    
}
