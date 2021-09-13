package com.ds.algo.challange.PopularPrograms.Pyramid;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 9/13/21 6:31 PM
 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking noOfRows value from the user
        System.out.println("How Many Rows You Want In Your Pyramid?");
        int noOfRows = sc.nextInt();
        //Initializing rowCount with 1
        int rowCount = 1;
        System.out.println("Here Is Your Pyramid");
        //Implementing the logic
        for (int i = noOfRows; i > 0; i--) {
            // "" logic
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // logic for print rowCount rowCount times
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
