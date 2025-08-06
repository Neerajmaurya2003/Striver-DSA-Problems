package Problems_On_Arrays.Easy_Array;

/*
 Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

Examples:

Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

Example 2:
Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
Output: 9 10 11 3 7 8
Explanation: Array is rotated to left by 3 position
 */

public class Rotate_Array_By_K_Element {

    //Using temp Array
    static int[] UsingTempArray(int[] arr,int n,int k,String dir){
        int [] temp=new int[n];
        if(dir.equals("left")){
            for(int i=0;i<n;i++){
                temp[i]=arr[k++%n];
            }
        }
        else if(dir.equals("right")){
            for(int i=0;i<n;i++){
                temp[k++%n]=arr[i];
            }
        }
        return temp;
    }
    //By Using Reversal Algorithm Reverse left
    static void ReverseLeft(int[]arr,int n,int k){

        ReverseArray(arr, 0, k-1);
        ReverseArray(arr, k, n);
        ReverseArray(arr, 0, n);

    }

    //By Using Reversal Algorithm Reverse Right
    static void ReverseRight(int[] arr,int n,int k){
        ReverseArray(arr, 0,n- k);
        ReverseArray(arr, n-k+1, n);
        ReverseArray(arr,0, n);
    }



    //Method To Reverse Array
   public static void ReverseArray(int [] arr,int l,int h){
        while(l<=h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("Using Temp Array :");
for (int i : UsingTempArray(arr, arr.length, 2, "right")) {
            System.out.println(i);
        }
        System.out.println("Using Reversal Algorithm:");
        ReverseRight(arr, arr.length-1, 2);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
