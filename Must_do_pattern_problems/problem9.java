package Must_do_pattern_problems;

/*
9.Program to print given Pattern

                                *                                
                        *       *       *                        
                *       *       *       *       *                
        *       *       *       *       *       *       *        
*       *       *       *       *       *       *       *       *
*       *       *       *       *       *       *       *       *
        *       *       *       *       *       *       *
                *       *       *       *       *
                        *       *       *
                                *

 */

public class problem9 {

    static void printPattern(int n){
            problem7.printPatternUpword(n);
            problem8.printPatternDownword(n);
    }

    public static void main(String[] args) {
        printPattern(5);
    }
    
}
