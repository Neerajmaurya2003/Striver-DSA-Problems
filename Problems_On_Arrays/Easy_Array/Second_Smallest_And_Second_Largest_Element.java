package Problems_On_Arrays.Easy_Array;

/*
 Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input: [1]
Output: Second Smallest : -1
	Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.
 */

public class Second_Smallest_And_Second_Largest_Element {

   //Method To Impliment insertion sort
    static void InsertionSort(int[] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){

            int j=i;
                while(j>0){
                    if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        j--;
                    }
                    else{
                        break;
                    }

                }
        }
    }

    //Using Sorting
    static void SmallestAndLargestUsingSorting(int[] arr){

        int n=arr.length;
        InsertionSort(arr);
        if(arr[0]==arr[n-1]){
            System.out.println("Second Smallest And Largest Element is -1");
        }
        else{
            int l=1,h=n-2;
            while (arr[0]==arr[l]) {
               l++;
            }
            while (arr[n-1]==arr[h]) {
                h--;
            }
            System.out.println("Second Smallest element is :"+ arr[l]);
            System.out.println("Second Largest Element is :"+arr[h]);
        }
    }

    //Better Approch(Without Sorting)
    static void SmallestAndLargestWithoutSorting(int [] arr){
        int min=arr[0],max=arr[0];
   

        for (int i : arr) {
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
    int min2=max,max2=min;

        for(int i: arr){
            if(i<min2 && i!=min){
                min2=i;
            }
            if(i>max2 && i!=max){
                max2=i;
            }

        }
        
            System.out.println("Second Smallest element is :"+ min2);
            System.out.println("Second Largest Element is :"+max2);

    }


    //Optimal Solution
    static void SmallestAndLargestOptimal(int[] arr){
        int min=Integer.MAX_VALUE,min2=Integer.MAX_VALUE,max=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;

        for (int i : arr) {
            if(i>min && i<min2) min2=i;
            if(i<min){
                min2=min;
                min=i;
            }
            if(i<max && i> max2) max2=i;
            if(i>max){
                max2=max;
                max=i;
            }
        }
        
            System.out.println("Second Smallest element is :"+ min2);
            System.out.println("Second Largest Element is :"+max2);

    }

    //Main Method 
    public static void main(String[] args) {

        int [] arr={1,2,4,7,7,5};
        SmallestAndLargestOptimal(arr);
    }
    
}
