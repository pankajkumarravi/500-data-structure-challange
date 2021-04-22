package com.ds.algo.challange.Array;

/**
 * @Author pankaj
 * @create 4/22/21 4:13 PM
 */
// Print all subarrays with 0 sum
public class printAllSubarrays {
    public static void main(String[] args) {
        int [] arr = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        printAllSubArrayWithZeroSum(arr);
    }

    public static void printAllSubArrayWithZeroSum(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            int sum=0;
            for (int j= i;j<arr.length;j++){
              sum+= arr[j];
              if (sum == 0)
                  System.out.println("Aub_array ["+i+"..."+j+"]");
            }
        }
    }
}
