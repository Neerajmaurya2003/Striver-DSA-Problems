package Problems_On_Arrays.Easy_Array;
/*
 Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.

 The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.


Example 1:
Input:
n = 5,m = 5.
arr1[] = {1,2,3,4,5}  
arr2[] = {2,3,4,4,5}
Output:
 {1,2,3,4,5}

Explanation: 
Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5} 

Example 2:
Input:
n = 10,m = 7.
arr1[] = {1,2,3,4,5,6,7,8,9,10}
arr2[] = {2,3,4,4,5,11,12}
Output: {1,2,3,4,5,6,7,8,9,10,11,12}
Explanation: 
Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1,6,7,8,9,10
Distnict Elemennts in arr2 are : 11,12
Union of arr1 and arr2 is {1,2,3,4,5,6,7,8,9,10,11,12}
 */

public class Union_Of_Two_Sorted_Arrays {

    static int[] UnionUsingExtraSpace(int[] arr1,int[] arr2){
        int m=arr1.length;
        int j=0,i=0,k=0;
        int n=arr2.length;
        int[] temp=new int[m+n];
        while (i<n && j<m) {
            if(arr2[i]<arr1[j]){
                temp[k++]=arr2[i++];
            }
            else if (arr1[j]<arr2[i]) {
                temp[k++]=arr1[j++];
            }
            else{
                i++;
            }
        }
        while (i<n)  temp[k++]=arr2[i++];
         while (j<m)  temp[k++]=arr1[j++];

        return temp;

    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int[] arr2={2,3,4,4,5,11,12};
        for (int i : UnionUsingExtraSpace(arr1, arr2)) {
            System.out.println(i);
        }
        
    }
    
}
