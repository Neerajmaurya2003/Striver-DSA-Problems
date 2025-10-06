package Problems_On_Arrays.Medium_Array;

import java.util.Arrays;

/*
 Problem Statement: Given a matrix, your task is to rotate the matrix 90 degrees clockwise.

Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]

Output: [[7,4,1],[8,5,2],[9,6,3]]

Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix.

Example 2:

Input: [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]

Output:[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix
 */



public class Rotate_Image_By_90_degrees {

    static void RotateImageBy90Degrees(int[][] mat,int n){
        TransposeMatrix(mat, n);

        for (int[] is : mat) {
            ReverseArray(is);
        }

    }

    static void TransposeMatrix(int[][] mat,int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }

    static void ReverseArray(int[] arr){
        int p1=0;
        int p2=arr.length-1;
        while (p1<p2) {
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
    }





    public static void main(String[] args) {

        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int n=mat.length;
        System.out.println("Matrix before Computations:");
        Set_Matrix_Zero.PrintMatrix(mat, n, n);
        RotateImageBy90Degrees(mat, n);
        System.out.println("Matrix After Computations:");
        Set_Matrix_Zero.PrintMatrix(mat, n, n);
        

    }
    
}
