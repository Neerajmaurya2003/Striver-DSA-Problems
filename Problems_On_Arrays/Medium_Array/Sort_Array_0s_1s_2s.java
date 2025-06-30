package Problems_On_Arrays.Medium_Array;
/*
 Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Input: nums = [2,0,1]
Output: [0,1,2]

Input: nums = [0]
Output: [0]
 */

public class Sort_Array_0s_1s_2s {


  //Method to Impliment Quick Sort
    static void QuickSort(int [] arr,int low,int high){

        if(low<high){
            int j=partition(arr, low, high);
            QuickSort(arr, low, j);
            QuickSort(arr, j+1, high);
        }

    }

    //Method to find Pivot 
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; 
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j; 
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    //Using Three Pointers
    static void UsingThreePointers(int [] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;

       while (mid<=high) {
         if(arr[mid]==0){
            int temp=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;
            
            low++;
            mid++;
         }
        else if (arr[mid]==1) mid++;
         else{
            int temp=arr[high];
            arr[high]=arr[mid];
            arr[mid]=temp;
            high--;
         }
       }

    }

    //By Counting the Variables
    static void ByCountingVariables(int[] arr){
        int zerocount=0,onecount=0;
        for (int i : arr) {
            if(i==0) zerocount++;
            if(i==1)onecount++;
        }
        for(int i=0;i<arr.length;i++){
            if(zerocount-->0) arr[i]=0;
            else if(onecount-->0) arr[i]=1;
            else arr[i]=2;
        }

    }




    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        UsingThreePointers(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        
        
    }
    
}
