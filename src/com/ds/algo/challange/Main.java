package com.ds.algo.challange;

/**
 * @Author pankaj
 * @create 4/21/21 11:00 PM
 */
public class Main {
    int si=0;
    Main(int x) {
        si=x;
    }

     public void r() {
         int [] a=new int[si];
         System.out.println(si);
        System.out.println(a[1]);
     }

    public static void main(String[] args) {
        Main main=new Main(5);
        main.r();
    }
}
