package Basic_Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 Problem statement: Given an array, we have found the number of occurrences of each element in the array.

Examples:

Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	 5  2
        15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array

Example2: 
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
	3  1
        4  2
Explanation: 2 occurs 3 times in the array
	     3 occurs 1 time in the array
             4 occurs 2 time in the array
 */

public class Count_Frequency_Of_Element {

    //By using Brute Force
    static void CountFrequencyBruteForce(int[] arr,int[] que){

        //Pre Storing In Hash Array
        int[] Hash=new int[20];
        for (int i : arr) {
            Hash[i]++;  
        }

        //Fetching From Hash Array
        for (int i : que) {
            System.out.println("Freuency of "+i+ " is:"+ Hash[i]);
        }
        

    } 


    //By using HashMap( Java Collections)
    static void CountFrequencyHashMap(int[] arr,int[] que){
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        for (int i : arr) {
            if(map.containsKey(i)){
                 map.put(i,map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
           
        }
        System.out.println("All the elements in the Hashmap are: ");
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                System.out.println(entry.getKey() +" : "+entry.getValue());
        }

        for(int i: que){
            System.out.println("Frequency of "+i+" is:"+ map.get(i));
        }
    } 



    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the Size Of Array:");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter the elements in the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Size of Queries:");
        int m=sc.nextInt();
        int[] que=new int[m];
        System.out.print("Enter the Queries:");
        for(int i=0;i<m;i++){
            que[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Using Brute Force");
        CountFrequencyBruteForce( arr, que);
        System.out.println();
        System.out.println("Using HashMap!!");
        CountFrequencyHashMap(arr, que);
    }
    
}
