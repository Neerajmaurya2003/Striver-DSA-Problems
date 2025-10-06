package Problems_On_Arrays.Medium_Array;

import java.util.HashSet;
import java.util.Set;

/*
  Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.

Examples 1:

Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]

Output: [[1,0,1],[0,0,0],[1,0,1]]

Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.
 
Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]

Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]

Explanation:Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0

 */

public class Set_Matrix_Zero {


    static void SetMatrixZero(int[][] mat,int n,int m){

        Set<Integer> iset=new HashSet<>();
        Set <Integer> jset=new HashSet<>(); 

        for (int i = 0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if(mat[i][j]==0){
                    iset.add(i);
                    jset.add(j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(iset.contains(i) || jset.contains(j)){
                    mat[i][j]=0;
                }
            }
        }
        
    }

    static void SetMatrixZeroOptimal(int [][] mat,int n ,int m ){
        boolean firstcol=false;
        for(int i=0;i<n;i++){
            if(mat[i][0]==0) {
                firstcol=true;
            }

     for (int j = 1; j < m; j++) {
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
                
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][0]==0||mat[0][j]==0){
                    mat[i][j]=0;
                }
            }
        }

        if(mat[0][0]==0){
            for(int i=0;i<m;i++){
                mat[0][i]=0;
            }
        }

        if(firstcol==true){
            for (int i = 0; i < n; i++) {
                mat[i][0]=0;

            }
        }

    }

    public static void PrintMatrix(int[][] mat,int n,int m){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    int[][] mat=   {{0,1,2,0},{3,4,5,2},{1,3,1,5}};     
    int n=mat.length;
    int m = mat[0].length;
    System.out.println("Matrix Before Computations:");
    PrintMatrix(mat,n,m);
    SetMatrixZeroOptimal(mat, n, m);  
  System.out.println("Matrix After Computations:");
    PrintMatrix(mat, n, m);
    }
    
}
