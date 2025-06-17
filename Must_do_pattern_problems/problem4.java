package Must_do_pattern_problems;

/*
4.Program to print given Pattern

1
2       2
3       3       3
4       4       4       4        
5       5       5       5       5

 */

public class problem4 {
    
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++){

            for(int j=0;j<=i;j++){
                System.out.print((i+1)+"\t");
            }
            System.out.println();
        }
    }
}
