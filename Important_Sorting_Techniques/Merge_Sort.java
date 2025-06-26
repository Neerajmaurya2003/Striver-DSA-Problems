package Important_Sorting_Techniques;

import java.util.ArrayList;

/*
 Problem:  Given an array of size n, sort the array using Merge Sort.

Examples:

Example 1:
Input: N=5, arr[]={4,2,1,6,7}
Output: 1,2,4,6,7,


Example 2:
Input: N=7,arr[]={3,2,8,5,1,4,23}
Output: 1,2,3,4,5,8,23
 */

public class Merge_Sort {

    //Method to impliment Merge Sort
    static void MergeSort(int[] arr,int l,int h){
        if(l<h){
            int mid=(l+h)/2;
            MergeSort(arr,l,mid);
            MergeSort(arr, mid+1, h);
            Merge(arr, l, mid, h);
        }
    }
    //Merge Function
    static void Merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
            }
        }
        while (left<=mid) {
            temp.add(arr[left++]);
        }
        while (right<=high) {
            temp.add(arr[right++]);
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }

    }

    
    public static void main(String[] args) {
        int[] arr= {4,2,1,6,7};
        System.out.println("Array Before Sorting is:");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        MergeSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("Array After Sorting is:");
        for (int i : arr) {
            System.out.print(i+"\t");
        }       


    }
    
}
