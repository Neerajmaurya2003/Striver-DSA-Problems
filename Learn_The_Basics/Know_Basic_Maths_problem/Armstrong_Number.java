package Know_Basic_Maths_problem;

/*
  
Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.
An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

 Example 1:
                Input:N = 153
               
                Output:True
                
                Explanation: 13+53+33 = 1 + 125 + 27 = 153
                                        
Example 2:
                Input:N = 371                
                
                Output: True
                
                Explanation: 33+53+13 = 27 + 343 + 1 = 371
								
 */
public class Armstrong_Number {

    //Method to check Armstrong Number
    static boolean ArmstrongNumber(int n){
        int temp=n;
        int arm=0;
        while (temp!=0){
            double rem=temp%10;
            arm=arm+(int)Math.pow(rem, 3.0);
            temp=temp/10;
        }
        if(arm==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        if(ArmstrongNumber(153)){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    
}
