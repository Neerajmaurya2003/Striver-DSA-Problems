package Must_do_pattern_problems;

/*
8.Program to print given Pattern

*       *       *       *       *       *       *       *       *
        *       *       *       *       *       *       *        
                *       *       *       *       *                
                        *       *       *                        
                                *    

 */

public class problem8 {
    
    public static void printPatternDownword(int n){

        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" \t");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*\t");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(" \t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
     printPatternDownword(5);   
    }
}
