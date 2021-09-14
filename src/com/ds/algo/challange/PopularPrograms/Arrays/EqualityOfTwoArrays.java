package com.ds.algo.challange.PopularPrograms.Arrays;

/**
 * @Author pankaj
 * @create 9/14/21 9:13 AM
 */
  // Two arrays are said to be equal if the arrays have equal number of elements and all corresponding pairs of elements in two arrays are equal. In the other words, two arrays are said to be equal if both the arrays have same elements in the same order.
public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 1, 7, 4,8};
        int[] arrayTwo = {2, 5, 1, 7, 4};
        // Iterative Way
        boolean isArrayEqual=true;
        if (arrayOne.length ==arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    isArrayEqual = false;
                }
            }
        } else {
            isArrayEqual = false;
        } if (isArrayEqual){
            System.out.println("Array is Equal !!!");
        }else
            System.out.println("Array is not Equal !!!!");
    }
}
