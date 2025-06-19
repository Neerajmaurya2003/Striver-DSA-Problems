package Know_Basic_Maths_problem;
import java.util.ArrayList;

public class All_Divisors {
    
    //Method to return all the divisors 
    static ArrayList<Integer> AllDivisors(int n){
        ArrayList<Integer> div=new ArrayList<Integer>();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                div.add(i);
            }
        }
        return div;
    }


    //Optimal Approch
    //Time compl
   static ArrayList<Integer> AllDivisorsOptimal(int n){

    ArrayList<Integer> div=new ArrayList<>();
    int sq=(int)Math.sqrt(n);    

     for(int i=1;i<=sq;i++){
        if(n%i==0){
            div.add(i);
            if(i!=n/i){
                div.add(n/i);
            }
        }
    }

    return div;

}

    public static void main(String[] args) {
        System.out.println(AllDivisorsOptimal(36));
    }
}
