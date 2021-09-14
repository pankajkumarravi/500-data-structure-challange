package com.ds.algo.challange.PopularPrograms.String.Duplicate;

/**
 * @Author pankaj
 * @create 9/14/21 8:16 AM
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FrequencyList {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("A");
        al.add("A");
        al.add("C");
        al.add("A");
        al.add("C");
        al.add("A");
        al.add("B");
        al.add("A");
        al.add("D");

        System.out.println("Without delete repeated character"+al);

        Set unique=new HashSet(al);
        System.out.println("unique character is"+unique);

        for(Object temp:unique){
            System.out.println("the character count is "+temp+":"+Collections.frequency(al, temp));

        }

    }

}