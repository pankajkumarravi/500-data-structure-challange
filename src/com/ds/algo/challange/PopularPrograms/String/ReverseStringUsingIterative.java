package com.ds.algo.challange.PopularPrograms.String;

/**
 * @Author pankaj
 * @create 9/13/21 2:15 PM
 */
public class ReverseStringUsingIterative {
    public static void main(String[] args) {
        String name="Pankaj Kumar";
        char cArray [] =name.toCharArray();
        for(int i=cArray.length-1;i>=0;i--){
            System.out.print(cArray[i]);
        }
    }
}
