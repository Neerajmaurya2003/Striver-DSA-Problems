package Must_do_pattern_problems;

/*
10.Program to print given Pattern.
*
**
***
****
*****
****
***
**
*

 */

public class problem10 {
    public static void printPattern(int n){
        int i=0;
        while (i<n){
            for(int j=0;j<=i;j++ ){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        while (i>0) {
            for(int j=0;j<i-1;j++){
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
