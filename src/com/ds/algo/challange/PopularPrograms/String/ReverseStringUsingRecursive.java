package com.ds.algo.challange.PopularPrograms.String;

/**
 * @Author pankaj
 * @create 9/13/21 2:19 PM
 */
public class ReverseStringUsingRecursive {
    public static void main(String[] args) {
        String name="Pankaj Kumar";
       System.out.println(reverseString(name));
    }
    public static String reverseString(String s){
        if ((s == null ) || (s.isEmpty())){
            return s;
        }
        return reverseString(s.substring(1))+s.charAt(0) ;
    }
    // If the “MyJava” is the string to reverse, then this method works like this.
    //
    //1st Call —>   recursiveMethod(“MyJava”)
    //2nd Call —> recursiveMethod(“yJava”) + “M”
    //3rd Call —>  (recursiveMethod(“Java”) + “y”) + “M”
    //4th call —>  ((recursiveMethod(“ava”) + “J”)+”y”) + “M”
    //5th Call —>  (((recursiveMethod(“va”) + “a”) + “J”)+”y”) + “M”
    //6th Call —>  ((((recursiveMethod(“a”) + “v”) + “a”) + “J”)+”y”) + “M”
}
