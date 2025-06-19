package Must_do_pattern_problems;

/*
3.Program to print given Pattern

1
1       2
1       2       3
1       2       3       4        
1       2       3       4       5

 */

public class problem3 {
    
    public static void main(String[] args) {
        
            for(int i=0;i<5;i++){
                for(int j=0;j<=i;j++){

                    System.out.print((j+1)+"\t");
                }
                System.out.println();
            }

    }
}
