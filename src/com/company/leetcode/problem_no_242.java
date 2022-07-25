package com.company.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class problem_no_242 {
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        } else if (s.length()==t.length()) {
            char[] a1= s.toCharArray();
            char[] a2= t.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            for (int i = 0; i < a1.length; i++) {
                if(a1[i]!=a2[i]){
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        problem_no_242 ob = new problem_no_242();
        boolean ans= ob.isAnagram("anagram","nagaram");
        System.out.println(ans);
    }

}
