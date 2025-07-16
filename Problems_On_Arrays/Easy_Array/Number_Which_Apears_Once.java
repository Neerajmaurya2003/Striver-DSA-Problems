package Problems_On_Arrays.Easy_Array;
/*
 Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer
 */

import java.util.HashMap;
import java.util.Map;

public class Number_Which_Apears_Once {

    //Using Hashmap
    static void UsingHashMap(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i : arr) {
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer,Integer> i : map.entrySet()) {
            if(i.getValue()==1){
                System.out.println(i.getKey());
            }
        }
    
    }

    //Using XOR Operation(Optimal Soluton)
    static void UsingXOR(int[] arr){
        int xor=0;
        for (int i : arr) {
            xor=xor^i;
        }
        System.out.println(xor);
    }


    public static void main(String[] args) {
        int [] arr={4,1,2,1,2};
        UsingXOR(arr);
        
    }
    
}
