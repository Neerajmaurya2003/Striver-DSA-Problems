package Must_do_pattern_problems;

/*
11.Program to print given Pattern

1
01
101
0101
10101

 */

public class prblem11 {

    static void printPattern(int n ){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
    
}
