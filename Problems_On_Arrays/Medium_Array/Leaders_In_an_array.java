package Problems_On_Arrays.Medium_Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 Problem Statement: Given an array, print all the elements which are leaders. A Leader is an element that is greater than all of the elements on its right side in the array.
 Example 1:
Input:
 arr = [4, 7, 1, 0]
Output:
 7 1 0
Explanation:
 Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.

Example 2:
Input:
 arr = [10, 22, 12, 3, 0, 6]
Output:
 22 12 6
Explanation:
 6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), also 22 is greater than 12, 3, 0, 6

 */

public class Leaders_In_an_array {

    static void Leader(int[] arr){
        int n=arr.length;
        
        ArrayList<Integer> leaders=new ArrayList<>();
        int max=arr[n-1];
        leaders.add(arr[n-1]);

        for (int i = n-1; i >= 0; i--) {
            if(arr[i]>max){
                leaders.add(arr[i]);
                max=arr[i];
            }
        }

        Collections.reverse(leaders);
        for (Integer integer : leaders) {
            System.out.println(integer);
        }


    }


    public static void main(String[] args) {
        int [] arr={10, 22, 12, 3, 0, 6};
        Leader(arr);
        
    }
    
}
