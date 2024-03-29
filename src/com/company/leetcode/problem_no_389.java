package com.company.leetcode;

import java.util.Arrays;

public class problem_no_389 {
    public char findTheDiference(String s,String t){
        char[] str1=s.toCharArray();
        char[] str2=t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i=0;i< str1.length;i++){
            if(str1[i]!=str2[i]){
                return str2[i];
            }
        }
        return str2[str2.length-1];
    }
    public static void main(String[] args) {
        problem_no_389 ob = new problem_no_389();
        char ans= ob.findTheDiference("abcd","abcde");
        System.out.println(ans);
    }
}
