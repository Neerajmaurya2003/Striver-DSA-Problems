package Problems_On_Arrays.Easy_Array;
/*
 Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

Example 1:
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

Example 2:
Input: 1,2,0,1,0,4,0
Output: 1,2,1,4,0,0,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
 */

public class Move_All_Zeros_At_End {

    //Move Zeros at End
    static void MoveZerosAtEnd(int[] arr){
        int p1=0,p2=0;
        int n=arr.length;
        while (p1<n-1 && p2<n-1) {
            while (p1<n-1 && arr[p1]!=0) p1++;
            p2=p1;
            while (p2<n-1 && arr[p2]==0)p2++;
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2++;
        }
    }
    //Using Extra Space
    static int[] MovesZerosAtEndUsingExtraSpace(int[] arr){
        int p=0;
        int [] temp=new int[arr.length];
        for (int i : arr) {
            if(i!=0){
                temp[p++]=i;
            }
            
        }
        return temp;
    }


    public static void main(String[] args) {
        int[] arr={1,2,0,1,0,4,0};
        for (int i : MovesZerosAtEndUsingExtraSpace(arr)) {
            System.out.println(i);
        }
        
    }
    
}
