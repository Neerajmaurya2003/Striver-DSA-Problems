package Basic_Hashing;

import java.util.HashMap;
import java.util.Map;

/*
 Problem Statement: Given an array of size N. Find the highest and lowest frequency element.

Examples:

Example 1:
Input: array[] = {10,5,10,15,10,5};
Output: 10 15
Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.

Example 2:

Input: array[] = {2,2,3,4,4,2};
Output: 2 3
Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.
 */

public class Highest_And_Lowest_Frequencies {

    //using Hash Array or Two Loops
    static void HighestAndLowestHashArray(int [] arr){

        int[] hash=new int[21];
        for (int i : arr) {
            hash[i]++;
        }

        int high=hash[0],low=20,ihigh=0,ilow=0;

        for (int i=0 ;i<hash.length;i++) {
            if(hash[i]<low && hash[i]!=0) {
                low=hash[i];
                ilow=i;
                if (low==0) {
                    break;
                }
            }
            if(hash[i]>high) {
                high=hash[i];
                ihigh=i;
            }
        }

        System.out.println("Highest Frequency is "+high+" And The element is "+ihigh);
        System.out.println("Lowest Frequency is "+low+" And The element is "+ilow);
    }

    //Using HashMap
    static void HighestAndLowestHashMap(int[] arr){
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i : arr) {
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        int high=map.get(arr[0]), low=map.get(arr[0]),highkey=arr[0],lowkey=arr[0];

        for (Map.Entry<Integer,Integer> i : map.entrySet()) {
            if(i.getValue()>high){
                high=i.getValue();
                highkey=i.getKey();
            }
            if(i.getValue()<low){
                low=i.getValue();
                lowkey=i.getKey();
            }

        }

        
        System.out.println("Highest Frequency is "+high+" And The element is "+highkey);
        System.out.println("Lowest Frequency is "+low+" And The element is "+lowkey);

    }


  
    

    public static void main(String[] args) {

        int [] arr={12,13,12,12,12,4,3,2,9,3};
        HighestAndLowestHashArray(arr);
        System.out.println("Using HashMap:");
        HighestAndLowestHashMap(arr);
    }

}
