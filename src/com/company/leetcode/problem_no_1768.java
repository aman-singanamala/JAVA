package com.company.leetcode;

import com.sun.security.jgss.GSSUtil;

public class problem_no_1768 {
    public String mergeAlternatively(String word1, String word2){
        String result="";
        int i=0;
        int j=0;

        while(i<word1.length() && j< word2.length()){
            result=result+word1.charAt(i)+word2.charAt(j);
            i++;
            j++;
        }
        while(i<word1.length()){
            result=result+word1.charAt(i);
            i++;
        }
        while(j<word2.length()){
            result=result+word2.charAt(j);
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        problem_no_1768 ob = new problem_no_1768();
        String ans= ob.mergeAlternatively("abc","pqr");
        System.out.println(ans);
    }
}
