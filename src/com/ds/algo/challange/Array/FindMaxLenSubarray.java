package com.ds.algo.challange.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author pankaj
 * @create 4/22/21 9:40 PM
 */
// Find maximum length subarray having a given sum
public class FindMaxLenSubarray {
    public static void main(String[] args) {
        int A[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int sum = 8;
        findMaxLenSubarray(A,sum);
        findMaxLenSubarray2(A,sum);
    }

    private static void findMaxLenSubarray(int[] arr, int sum) {
            int max_length=0;
            int ending_index=-1;

        for (int i=0;i<arr.length;i++) {
            int result = 0;
            for (int j = i; j < arr.length; j++) {
                result += arr[j];
                if (result == sum) {
                    // update length and ending index of maximum length subarray
                    if (max_length < j - i + 1){
                        max_length= j-i+1;
                        ending_index= j;
                    }
                }
            }
        }
        // print the subarray
        System.out.println("["+(ending_index-max_length+1)+", "+ending_index+"]");
    }
    public static void findMaxLenSubarray2(int[] A, int S)
    {
        // create an empty HashMap to store the ending index of the first
        // subarray having some sum
        Map<Integer, Integer> map = new HashMap<>();

        // insert `(0, -1)` pair into the set to handle the case when a
        // subarray with sum `S` starts from index 0
        map.put(0, -1);

        int sum = 0;

        // `len` stores the maximum length of subarray with sum `S`
        int len = 0;

        // stores ending index of the maximum length subarray having sum `S`
        int ending_index = -1;

        // traverse the given array
        for (int i = 0; i < A.length; i++)
        {
            // sum of elements so far
            sum += A[i];

            // if the sum is seen for the first time, insert the sum with its
            // into the map
            map.putIfAbsent(sum, i);

            // update length and ending index of the maximum length subarray
            // having sum `S`
            if (map.containsKey(sum - S) && len < i - map.get(sum - S))
            {
                len = i - map.get(sum - S);
                ending_index = i;
            }
        }

        // print the subarray
        System.out.println("[" + (ending_index - len + 1) + ", " + ending_index + "]");
    }
}
