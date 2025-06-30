package Problems_On_Arrays.Medium_Array;
/*
 Problem Statement: Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.

Example 1:
Input Format: N = 3, nums[] = {3,2,3}
Result: 3
Explanation: When we just count the occurrences of each number and compare with half of the size of the array, you will get 3 for the above solution. 

Example 2:
Input Format:  N = 7, nums[] = {2,2,1,1,1,2,2}

Result: 2

Explanation: After counting the number of times each element appears and comparing it with half of array size, we get 2 as result.

Example 3:
Input Format:  N = 10, nums[] = {4,4,2,4,3,4,4,3,2,4}

Result: 4
 */

import java.util.HashMap;
import java.util.Map;

public class Majority_Elements {

    //Using Sorting
    static int UsingSorting(int[] arr,int n){
        int element=arr[0];
        int count=0;
        Sort_Array_0s_1s_2s.QuickSort(arr, 0, n-1);

        for(int i=0;i<n;i++){
            if(arr[i]==element){
                
                count++;
                if (count>n/2) return arr[i];
            }
            else{
                element=arr[i];
                count=1;
            }
      
        }
        return -1;
    }

    //Optimal Approch
    static int UsingTwoVariable(int[] arr){
        int count=0;
        int element=arr[0];
        for (int i : arr) {
            if(i==element) count++;
            else{
                if(count==0){
                    count++;
                    element=arr[i];
                }
                else count--;
            }
        }
        return element;
    }

    //Using HashMap
    static int UsingHashMap(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer,Integer> i : map.entrySet()) {

            if(i.getValue()>arr.length/2){
                return i.getKey();
            }
            
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr={4,4,2,4,3,4,4,3,2,4};
        System.out.println(UsingHashMap(arr));
        
    }
    
}
