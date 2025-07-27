package Problems_On_Arrays.Medium_Array;

import java.util.ArrayList;

/*
 Problem Statement:

There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.

Note: Start the array with positive elements.

Examples: 

Example 1:

Input:
arr[] = {1,2,-4,-5}, N = 4
Output:
1 -4 2 -5

Explanation: 

Positive elements = 1,2
Negative elements = -4,-5
To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.

Example 2:
Input:
arr[] = {1,2,-3,-1,-2,-3}, N = 6
Output:
1 -3 2 -1 3 -2
Explanation: 

Positive elements = 1,2,3
Negative elements = -3,-1,-2
To maintain relative ordering, 1 must occur before 2, and 2 must occur before 3.
Also, -3 should come before -1, and -1 should come before -2.
 */

public class Rearrange_Array_Element_by_sign {


    //Using Extra Space
    static int[] UsingExtraSpace(int[] arr){

        ArrayList<Integer> Pos=new ArrayList<>();
        ArrayList<Integer> Neg=new ArrayList<>();
        for (int i : arr) {
            if(i<0) Neg.add(i);
            else Pos.add(i);
        }
        int p=0,n=0,k=0;
        int [] temp=new int[arr.length];
        while (p<Pos.size() && n < Neg.size()) {
            temp[k++]=Pos.get(p++);
            temp[k++]=Neg.get(n++);
        }

        while (p<Pos.size()) {
             temp[k++]=Pos.get(p++);
        }
         while (n<Neg.size()) {
             temp[k++]=Neg.get(n++);
        }
        return temp;

    }






    public static void main(String[] args) {
        int[] arr={1,2,-3,-1,-2,-3};
        for (int i : UsingExtraSpace(arr)) {
            System.out.println(i);
        }
      
    }
    
}
