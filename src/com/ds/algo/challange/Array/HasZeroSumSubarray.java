package com.ds.algo.challange.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author pankaj
 * @create 4/22/21 10:33 AM
 */
// Check if a subarray with 0 sum exists or not
public class HasZeroSumSubarray {
    public static void main(String[] args) {
        int [] Input=  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
         boolean res = subArraySumWithZero(Input);
            if (res)
                System.out.println("SubArray Exists !!!");
            else
                System.out.println("SubArray doesn't Exists !!");
    }

    private static boolean subArraySumWithZero(int[] input) {
        Set<Integer> set= new HashSet<>();
        // insert 0 into the set to handle the case
        set.add(0);
        int sum=0;
        for (int value: input)
        {
            sum+=value;
            if (set.contains(sum))
            {
                return true;
            }

            // insert sum so far into the set
            set.add(sum);
        }
        return false;
    }
}
