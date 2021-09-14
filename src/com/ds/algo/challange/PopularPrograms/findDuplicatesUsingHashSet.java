package com.ds.algo.challange.PopularPrograms;

import java.util.HashSet;

/**
 * @Author pankaj
 * @create 9/14/21 11:30 AM
 */
public class findDuplicatesUsingHashSet {
    private static void findDuplicatesUsingHashSet(int[] inputArray) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int element : inputArray) {
            if (!set.add(element)) {
                System.out.println("Duplicate Element : " + element);
            }
        }
    }}