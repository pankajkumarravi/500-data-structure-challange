package com.ds.algo.challange.PopularPrograms.Pyramid;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 9/13/21 6:56 PM
 */
public class PyramidPattern6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Taking noOfRows value from the user
        System.out.println("How Many Rows You Want In Your Pyramid?");
        int noOfRows = sc.nextInt();
        //Initializing rowCount with 1
        int rowCount = 1;
        System.out.println("Here Is Your Pyramid");
        //Implementing the logic
        for (int i = noOfRows; i >= 1; i--)
        {
            //Printing i*2 spaces at the beginning of each row
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
            //Printing j where j value will be from i to noOfRows
            for (int j = i; j <= noOfRows; j++)
            {
                System.out.print(j+" ");
            }
            //Printing j where j value will be from noOfRows-1 to i
            for (int j = noOfRows-1; j >= i; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            //Incrementing the rowCount
            rowCount++;
        }
    }
}
