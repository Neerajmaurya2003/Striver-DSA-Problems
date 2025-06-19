package Learn_Basic_Recursion;

import java.util.Scanner;

/*
  Problem: Print your Name N times using recursion

 */

public class Print_Name_N_Times {


    //Recursive Method to print Name N times
    static void PrintName(int n, int count,String name){

        if(count==n){
        
        }
        else{
            System.out.println(name);
            PrintName(n, ++count, name);
        }

    }

    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Your Name:");
        String name=sc.nextLine();
        sc.close();
        PrintName(n, 0, name);
        
    }
    
}
