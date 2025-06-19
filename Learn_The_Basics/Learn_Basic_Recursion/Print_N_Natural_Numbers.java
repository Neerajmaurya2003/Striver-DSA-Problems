package Learn_Basic_Recursion;

import java.util.Scanner;

/*
  Problem: Print from 1 to N using Recursion

 */

public class Print_N_Natural_Numbers {

    //Method to print N Natural Numbers(Forward Recursion)
    static void Print_N_NaturalNumbers(int count,int n){
        if(count!=n+1){
            System.out.println(count);
            Print_N_NaturalNumbers(++count,n);
        }
    }

    //Using Backword Recursion(BackTracking)
    static void PrintNumbers_Backtracking(int i,int n){

        if(i<1) return ;

            PrintNumbers_Backtracking(i-1, n);
            System.out.println(i);
        
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        sc.close();
        Print_N_NaturalNumbers(1, n);
        System.out.println();
        System.out.println();
        PrintNumbers_Backtracking(n, n);
    }
    
}
