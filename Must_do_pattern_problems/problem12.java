package Must_do_pattern_problems;

/*
12.Program to print given Pattern

1        1
12      21
123    321
1234  4321
1234554321

 */

public class problem12 {

    static void printPattern(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j =i+1;j<=n;j++){
                System.out.print(" ");
            }
            for(int j =i+1;j<=n;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
    
}
