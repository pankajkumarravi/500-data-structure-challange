package com.ds.algo.challange.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author pankaj
 * @create 4/21/21 9:42 PM
 */
// Find a pair with the given sum in an array
public class Findpairwithgivensum<Approach> {

   /* Input:

    arr = [8, 7, 2, 5, 3, 1]
    sum = 10

    Output:

    Pair found (8, 2)
    or
    Pair found (7, 3)*/
   public static void main(String[] args) {
    int[] arr={8, 7, 2, 5, 3, 1};
    int sum=10;
        findPair(arr,sum);
        findPairApproach2(arr,sum);
        findPairUsingHashing(arr,sum);
   }
   // ===================== Brute-Force solution,Tc=O(n2) ==================
    public static void findPair(int[] arr, int sum)
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;i<arr.length-1;j++)
            {
                if (arr[i]+arr[j] == sum){
                    System.out.println("Pair found for "+sum+" = ("+arr[i]+","+arr[j]+")");
                    return;
                }
            }
        }
        System.out.println("Pair not Found for "+sum);
    }
    // ==================== Using Sorting =================
   /* Approach
    1. sort the array
    2. use two indices(low,high), and srarch for sum*/
    public static void findPairApproach2(int [] arr,int sum)
    {
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while (start < end)
        {
                if (arr[start]+arr[end] == sum)
                {
                    System.out.println("Pair found for "+sum+" = ("+arr[start]+","+arr[end]+")");
                    return;
                }else  if(arr[start]+arr[end]<sum) {
                    start++;
                }else {
                    end++;
            }
        }
        System.out.println("Pair not Found for "+sum);

    }
    // ========= Using Hashing ==========
    public static void findPairUsingHashing(int [] arr, int sum) {
        // create Empty bHashmap
        Map<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<arr.length;i++)
        {
            // check if pair `(A[i], sum-A[i])` exists
            if (map.containsKey(sum-arr[i])) {
                System.out.printf("Pair found (%d, %d)", arr[map.get(sum - arr[i])], arr[i]);
                return;
            }
            // store index of the current element in the map
                map.put(arr[i],i);
        }
        System.out.println("Pair not found");
    }
}
