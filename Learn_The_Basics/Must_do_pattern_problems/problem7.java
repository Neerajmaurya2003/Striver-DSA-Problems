package Must_do_pattern_problems;

/*
7.Program to print given Pattern

                                *                                
                        *       *       *                        
                *       *       *       *       *                
        *       *       *       *       *       *       *        
*       *       *       *       *       *       *       *       *

 */

public class problem7 {

    public static void printPatternUpword(int n){
        for(int  i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" \t");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" \t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPatternUpword(5);

    }


}
