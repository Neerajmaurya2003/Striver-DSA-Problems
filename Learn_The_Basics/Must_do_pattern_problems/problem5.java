package Must_do_pattern_problems;


/*
5.Program to print given Pattern

*       *       *       *       *
*       *       *       *        
*       *       *
*       *
*

 */

public class problem5 {
    
    public static void main(String[] args) {
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
