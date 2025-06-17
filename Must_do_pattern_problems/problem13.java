package Must_do_pattern_problems;

/*
13.Program to print given Pattern

1
2       3
4       5       6
7       8       9       10
11      12      13      14      15

 */

public class problem13 {

    static void printPattern(int n ){
        int count=1;
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
    
}
