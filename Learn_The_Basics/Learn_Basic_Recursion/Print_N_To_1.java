package Learn_Basic_Recursion;

import java.util.Scanner;

/*
 Problem: Print from N to 1 using Recursion
 */

public class Print_N_To_1 {
    
    //Print N to 1 Numbers (Forword recursion)
    static void Print_N_To1(int n){
        if(n==0) return ;

        System.out.println(n);
        Print_N_To1(--n);
    }

    //By using Backtracking
    static void Print_N_To1_Backtracking(int i,int n){
        if(i>n) return ;
        Print_N_To1_Backtracking(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter The Number:");
        int n=sc.nextInt();
        sc.close();
        Print_N_To1_Backtracking(1,n);
    }
}
