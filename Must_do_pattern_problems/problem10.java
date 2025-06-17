package Must_do_pattern_problems;

/*
10.Program to print given Pattern

*
**
***
****
*****
****
***
*

PS C:\Users\User\Desktop\Striver DSA problems> ^C
PS C:\Users\User\Desktop\Striver DSA problems> 
PS C:\Users\User\Desktop\Striver DSA problems>  c:; cd 'c:\Users\User\Desktop\Striver DSA problems'; & 'C:\Program Files\Java\jdk-23\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\User\AppData\Roaming\Code\User\workspaceStorage\3f5bc892beb1052d0b609ea5fc4551ba\redhat.java\jdt_ws\Striver DSA problems_d9eee60f\bin' 'Must_do_pattern_problems.problem10' 
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
