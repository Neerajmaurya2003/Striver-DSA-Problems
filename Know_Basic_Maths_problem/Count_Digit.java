package Know_Basic_Maths_problem;

// Problem Statement: Given an integer N, return the number of digits in N.
//              Example 1:
//                 Input:N = 12345
               
//                 Output:5
                
//                 Explanation:  The number 12345 has 5 digits.
                                        
//              Example 2:
//                 Input:N = 7789                
                
//                 Output: 4
                
//                 Explanation: The number 7789 has 4 digits.                   



public class Count_Digit {

    //Brute Force Technique
    // Time Complexity O(Log N) with base 10
    static int CountDigit(int n){
        int temp=0;
        while(n!=0){
            n=n/10;
            temp++;
        }

        return temp;
    }


    //Optimal Method
    // Time Complexity O(1) as computation takes constant time
    static int CountDigitOptimal(int n){

        int val=(int) Math.log10(n)+1;

        return val;

    }

    public static void main(String[] args) {
        
        System.out.println(CountDigit(2595));
        System.out.println(CountDigitOptimal(909090));
        System.out.println(CountDigit(1000000));
        System.out.println(CountDigitOptimal(1000000002));
    }
    
}
