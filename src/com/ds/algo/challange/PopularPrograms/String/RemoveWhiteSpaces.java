package com.ds.algo.challange.PopularPrograms.String;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 9/14/21 7:33 AM
 */
//we use replaceAll() method of String class to remove all white spaces (including tab also) from a string. This is one of the easiest method to remove spaces from string in java. replaceAll() method takes two parameters. One is the string to be replaced and another one is the string to be replaced with. We pass the string “\\s+” to be replaced with an empty string “”.
public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string to be cleaned from white spaces...!");
        String inputString = sc.nextLine();
        String strWithoutSpace = inputString.replaceAll("\\s","");
        System.out.println("Entered String "+inputString);
        System.out.println("Without space string "+strWithoutSpace);
    }

}
