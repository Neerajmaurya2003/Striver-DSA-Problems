package Must_do_pattern_problems;

/*
2.Program to print given Pattern

*
*       *
*       *       *
*       *       *       *        
*       *       *       *       *

 */

public class problem2 {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
