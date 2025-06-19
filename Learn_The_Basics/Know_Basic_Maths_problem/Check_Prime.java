package Know_Basic_Maths_problem;

import java.util.Scanner;

/*
 Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.

    Example 1:
                Input:N = 2
               
                Output:True
                
                Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
                                        
    Example 2:
                Input:N =10                
                
                Output: False
                
                Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.     
 */

public class Check_Prime {

    //Check Prime Number By brute force
    //Time Complexity is O(n)
    static boolean CheckPrime_BruteForce(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }

        return false;
    }

    //Better Approch to Check Prime Number
    //Time Complexity is O(n/2)
    static boolean CheckPrime_BetterApproch(int n){
        
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }


        return true;
    }

    //Optimal Approch to Check Prime Number
    //Time Complexity is O(sqrt(n))
    static boolean CheckPrime_OptimalApproch(int n){

        int sq=(int)Math.sqrt(n);

        for(int i=2;i<=sq;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    } 


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number:");
        int n=sc.nextInt();
        sc.close();

        if(CheckPrime_OptimalApproch(n)){
            System.out.println("Prime Number!!");
        }
        else{
            System.out.println("Not Prime!!");
        }
        
    }
    
}
