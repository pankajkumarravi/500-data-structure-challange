package com.ds.algo.challange.Array;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 4/22/21 5:23 PM
 */
// Sort binary array in linear time
public class SortBinaryArray {
    public static void main(String[] args) {
        int[] bolArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1};
        sortBooleanArray(bolArray);
        System.out.println(Arrays.toString(bolArray));
    }

    private static void sortBooleanArray(int[] bolArray) {
        int zeroCount = 0;
        //count all zero present in booleanArray
        for (int i = 0; i < bolArray.length; i++) {
            if (bolArray[i] == 0)
                zeroCount++;
        }
        System.out.println("zero count = "+zeroCount);
        int index = 0;
        //put zero values in starting of array
        while (zeroCount > 0) {
            bolArray[index++] = 0;
            zeroCount--;
        }
        // put 1 values in remaining array
        while (index < bolArray.length) {
            bolArray[index++] =1;
        }
    }
}