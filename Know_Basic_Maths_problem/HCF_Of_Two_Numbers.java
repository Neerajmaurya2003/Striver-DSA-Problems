package Know_Basic_Maths_problem;



/*
Problem Statement: Given two integers N1 and N2, find their greatest common divisor.
The Greatest Common Divisor of any two integers is the largest number that divides both integers.

 Example 1:
                Input:N1 = 9, N2 = 12
                
                
                Output:3
                Explanation:Factors of 9: 1, 3 and 9
                Factors of 12: 1, 2, 3, 4, 6, 12
                Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.



                                
Example 2:
                Input:N1 = 20, N2 = 15
                
                
                Output: 5
                Explanation:Factors of 20: 1, 2, 4, 5
                Factors of 15: 1, 3, 5
                Common Factors: 1, 5 out of which 5 is the greatest hence it is the GCD.


 */

public class HCF_Of_Two_Numbers {
    
    //HCF By Brute force
    static int HCF_By_BruteForce(int n1, int n2){
        int common=1;
        int n=Math.min(n1, n2);
        for(int i=2;i<=n;i++){
            if(n1%i==0 && n2%i==0 && common<i){
                common=i;
            }
        }
        return common;
    }

    //Better Method
    static int HCF_BetterMethod(int n1,int n2){
        int common=1;
        int min=Math.min(n2,n1);
        for(int i=min;i>1;i--){
            if(n1%i==0 && n2%i==0 ){
                return i;
            }
        }
        return common;
    } 

    //Optimal Approch
    static int HCF_By_Euclidean_Algorithm(int n1,int n2){
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }
        if(n1==0){
            return n2;
        }
        return n1;
    }

    public static void main(String[] args) {
        System.out.println(HCF_By_BruteForce(19, 76));
        System.out.println(HCF_BetterMethod(19, 76));
        System.out.println(HCF_By_Euclidean_Algorithm(19, 76));
    }
}
