package com.ds.algo.challange.PopularPrograms.String.Duplicate;

import java.util.HashMap;
import java.util.Set;

/**
 * @Author pankaj
 * @create 9/14/21 8:02 AM
 */
//Write a java program to find duplicate characters and their count in a given string? Ex ; duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2.
  /*First, we convert the given string to char array. We then create one HashMap with Character
          as a key and it’s number of occurrences as a value. Then we extract a Set containing
          all keys of this HashMap using keySet() method. Then we use this keySet to get the duplicate characters*/
public class DuplicateCharInStringWithCount {
    static void duplicateCharCount(String inputString)
    {
        //Creating a HashMap containing char as key and it's occurrences as value

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        //Converting given string to char array

        char[] strArray = inputString.toCharArray();

        //checking each char of strArray

        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1

                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value

                charCountMap.put(c, 1);
            }
        }

        //Getting a Set containing all keys of charCountMap

        Set<Character> charsInString = charCountMap.keySet();

        System.out.println("Duplicate Characters In "+inputString);

        //Iterating through Set 'charsInString'

        for (Character ch : charsInString)
        {
            if(charCountMap.get(ch) > 1)
            {
                //If any char has a count of more than 1, printing it's count

                System.out.println(ch +" : "+ charCountMap.get(ch));
            }
        }
    }

    public static void main(String[] args)
    {
        duplicateCharCount("JavaJ2EE");

        duplicateCharCount("Fresh Fish");

        duplicateCharCount("Better Butter");
    }
}
