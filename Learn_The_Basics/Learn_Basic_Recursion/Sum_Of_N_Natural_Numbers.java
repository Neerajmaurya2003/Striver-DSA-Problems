    package Learn_Basic_Recursion;

    import java.util.Scanner;

    /*
    Problem statement: Given a number ‘N’, find out the sum of the first N natural numbers.

    Example 1:
    Input: N=5
    Output: 15
    Explanation: 1+2+3+4+5=15

    Example 2:
    Input: N=6
    Output: 21
    Explanation: 1+2+3+4+5+6=21
    */

    public class Sum_Of_N_Natural_Numbers {

        //Sum Of N natural Numbers (Forward Recursion)
        static int Sum_forward(int n){

            if(n==0) return 0;

            return n+Sum_forward(n-1);        
        }

        //Sum Of N Natural Numbers Alternate way
        static int Sum_Backward(int i,int n){
            if(i>n) return 0;

            return Sum_Backward(i+1, n)+i;
        }

        //By Using Formula
        //Time complexity O(1)
        static int Sum_Formula(int n){

            return n*(n+1)/2;
        }

        public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Number:");
            int n=sc.nextInt();
            sc.close();
        System.out.println(Sum_Formula(n));

        }
        
    }
