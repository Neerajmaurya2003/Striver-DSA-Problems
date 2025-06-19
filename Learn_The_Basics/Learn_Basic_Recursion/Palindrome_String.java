package Learn_Basic_Recursion;

import java.util.Scanner;

/*
 Problem Statement: "Given a string, check if the string is palindrome or not."  A string is said to be palindrome if the reverse of the string is the same as the string.

Examples:

Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.
 */

public class Palindrome_String {

    //By Using Two Pointer Approch
    static boolean PalindromeString(String str){

        int p1=0,p2=str.length()-1;
        while(p1<p2){
            if(str.charAt(p1)!=str.charAt(p2)){
                return false;
            }
            p1++;
            p2--;
        }

        return true;
    }

    // Recursive Approch
    static void PalindromeStringRecursive(String str,int p1,int p2){
        if(p1<p2){
            if(str.charAt(p1)!=str.charAt(p2)){
                System.out.println("Not a Palindrome!!");
            }
            else{
                PalindromeStringRecursive(str, p1+1, p2-1);
            }
        }
        else{
            System.out.println("palindrome String!!");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        sc.close();

        PalindromeStringRecursive(str, 0, str.length()-1);

        
    }
    
}
