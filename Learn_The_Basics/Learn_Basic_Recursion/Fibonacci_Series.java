package Learn_Basic_Recursion;

import java.util.Scanner;

/*
 Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

Examples:

Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

Example 2:
Input: 6

Output: 0 1 1 2 3 5 8
Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing

*/

public class Fibonacci_Series {

    //Using Loop
    static void Fibonacci_UsingLoop(int n){
        int p1=0,p2=1;
        for(int i=0;i<n;i++){
            if(i<=1){
                System.out.println(i);
            }
            else{
                int sum=p1+p2;
                System.out.println(sum);
                p1=p2;
                p2=sum;
            }
        }
    }

    //Using Recursion
static int Fibonacci_UsingRecursion(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    return Fibonacci_UsingRecursion(n - 1) + Fibonacci_UsingRecursion(n - 2);
}


    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            System.out.println(Fibonacci_UsingRecursion(i));   
        }
     
    }
}
