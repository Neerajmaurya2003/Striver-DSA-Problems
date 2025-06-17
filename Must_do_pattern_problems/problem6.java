package Must_do_pattern_problems;

/*
6.Program to print given Pattern

1       2       3       4       5
1       2       3       4        
1       2       3
1       2
1

 */

public class problem6 {
    public static void main(String[] args) {
        
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                    System.out.print((j+1)+"\t");
            }
            System.out.println();
        }
    }
}
