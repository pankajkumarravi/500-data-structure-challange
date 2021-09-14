package com.ds.algo.challange.PopularPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author pankaj
 * @create 9/14/21 11:46 AM
 */
// method uses Java 8 Streams to find duplicates in array.
public class DuplicatesUsingJava8 {
    private static void findDuplicatesUsingJava8(int[] inputArray)
    {
        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                .filter(i -> !uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toSet());

        System.out.println(duplicateElements);
    }

    public static void main(String[] args) {
        findDuplicatesUsingJava8(new int[]{22,11,23,32,44,55,66,22,33,55,80,99});
    }
}
