package com.ds.algo.challange.PopularPrograms.String;

/**
 * @Author pankaj
 * @create 9/14/21 7:47 AM
 */
public class RemoveSpaces {
    public static void main(String[] args) {
        String s1="kkklllm  ll mm  raavvi ";
        char[] c1=s1.toCharArray();
        StringBuilder sb=new StringBuilder(s1);
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<sb.length();i++)
        {

            int index=sb.indexOf(" ");
            if(index!=-1)
                sb=sb.deleteCharAt(index);
        }
        System.out.println(sb);

    }
}
