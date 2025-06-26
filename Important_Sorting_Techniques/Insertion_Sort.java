package Important_Sorting_Techniques;

/*
 Problem Statement: Given an array of N integers, write a program to implement the Insertion sorting algorithm.

Examples:

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: 
After sorting the array is: 9,13,20,24,46,52


Example 2:
Input: N=5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting the array is: 1,2,3,4,
 */

public class Insertion_Sort {

    //Method To Impliment insertion sort
    static void InsertionSort(int[] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){

            int j=i;
                while(j>0){
                    if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        j--;
                    }
                    else{
                        break;
                    }

                }
        }
    }



    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
         System.out.println("Array Before Sorting is:");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        InsertionSort(arr);
        System.out.println();
        System.out.println("Array After Sorting is:");
        for (int i : arr) {
            System.out.print(i+"\t");
        }

    }
    
}
