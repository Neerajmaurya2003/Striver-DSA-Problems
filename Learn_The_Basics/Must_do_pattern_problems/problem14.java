package Must_do_pattern_problems;

/*
14.Program to print given Pattern

A
AB
ABC
ABCD
ABCDE

 */

public class problem14 {

    static void printPattern(int n){
        char[] s={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
         for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(s[j%27]);
            }
            System.out.println();
         }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
    
}
