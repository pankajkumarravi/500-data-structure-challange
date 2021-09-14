package com.ds.algo.challange.PopularPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author pankaj
 * @create 9/14/21 11:36 AM
 */
    //HashMap to find duplicates in array in java. We store the elements of input array as keys of the HashMap and their occurrences as values of the HashMap. If the value of any key is more than one (>1) then that key is duplicate element. Using this method, you can also find the number of occurrences of duplicates. The time and space complexity of this solution is O(n).


public class fiFndDuplicatesUsingHashMap {
    private static void findDuplicatesUsingHashMap(int[] inputArray)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : inputArray)
        {
            if(map.get(element) == null)
            {
                map.put(element, 1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet)
        {
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
    }

    public static void main(String[] args) {
        findDuplicatesUsingHashMap(new int[]{22,11,23,32,44,55,66,22,33,55,80,99});
    }
}
