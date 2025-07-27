package Problems_On_Arrays.Medium_Array;

/*
 Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and 
sell on day 5 (price = 6), profit = 6-1 = 5.

Note: That buying on day 2 and selling on day 1 
is not allowed because you must buy before 
you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are 
done and the max profit = 0

 */

public class Stock_Buy_and_Sell {

    //Using Brute Force
    static void UsingBruteForce(int[] arr){
        int profit=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                profit=Math.max(profit, arr[j]-arr[i]);
            }
        }
        System.out.println(profit);
    }

    //By Tracking Minimum Element
    static void ByTrackingMin(int[] arr){
        int min=Integer.MAX_VALUE,profit=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=i;
            }
            profit=Math.max(profit, i-min);
        }
        System.out.println(profit);
    }



    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        ByTrackingMin(arr);
    }
    
}
