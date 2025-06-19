package Learn_Basic_Recursion;

import java.util.Scanner;

/*
  Problem Statement: Given a number X,  print its factorial.

To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.

Note: X  is always a positive number. 

Examples:

Example 1:
Input: X = 5
Output: 120
Explanation: 5! = 5*4*3*2*1

Example 2:
Input: X = 3
Output: 6
Explanation: 3!=3*2*1
 */

public class Factorial {

//Using Forward Recursion
static int Fact_Forward(int n){
    if(n==0){
        return 1;
    }

    return n*Fact_Forward(n-1);
}

//Alternative way
static int Fact_Backward(int i,int n){
    if(i==0) return 1;
    return Fact_Backward(i-1,n)*i;
}

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        sc.close();
        System.out.println(Fact_Forward(n));
        System.out.println(Fact_Backward(n, n));
    }
    
}
