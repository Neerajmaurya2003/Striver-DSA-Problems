package Know_Basic_Maths_problem;

/*
Problem Statement: Given an integer N return the reverse of the given number.
Note: If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

Example 1:
                Input:N = 12345
               
                Output:54321
                
                Explanation: The reverse of 12345 is 54321.
                                        
Example 2:
                Input:N = 7789                
                
                Output: 9877
                
                Explanation: The reverse of number 7789 is 9877.


 */

public class Reverse_Digits_Of_a_Number {

    static int ReverseDigit(int n){
        int rev=0;
        while (n%10==0) n=n/10;
       
        while (n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev; 
    }

    public static void main(String[] args) {
        System.out.println(ReverseDigit(3423));
        System.out.println(ReverseDigit(87800));
        System.out.println(ReverseDigit(8976000));
    }
    
}
