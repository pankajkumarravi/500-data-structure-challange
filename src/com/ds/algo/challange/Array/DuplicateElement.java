package com.ds.algo.challange.Array;

/**
 * @Author pankaj
 * @create 4/22/21 6:23 PM
 */
// Find the duplicate element in a limited range array
public class DuplicateElement {
    public static void main(String[] args) {
        int Input[]=  { 1, 2, 3, 4, 4 };
        System.out.println(findDuplicate(Input));
    }

    private static int findDuplicate(int[] input) {
        boolean visited[] = new boolean[input.length+1];
        for (int ele:input) {
            // if the element is seen before
            if (visited[ele]){
                return ele;
            }
            // make element is visited
            visited[ele] =true;
        }
        return -1;// not found duplicate
    }
}
