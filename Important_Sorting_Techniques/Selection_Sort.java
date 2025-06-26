package Important_Sorting_Techniques;

/*
 Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

Example 2:
Input: N=5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting the array is: 1, 2, 3, 4, 5
 */

public class Selection_Sort {

    //Method to Impliment Selection Sort
    //Time Complexity is O(N^2)
    static void SelectionSort(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }


    public static void main(String[] args) {
        int [] arr={13,46,24,52,20,9};
        SelectionSort(arr);

        System.out.println("Array After Sorting is:");
        for (int i : arr) {
            System.out.println(i);
        }
        
    }
    
}
