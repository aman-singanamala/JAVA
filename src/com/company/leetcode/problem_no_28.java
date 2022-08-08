package com.company.leetcode;

public class problem_no_28 {
    public int strStr(String haystack,String needle){
        if(needle.length()>haystack.length()) {
            return -1;
        }
        int i=0,j=0;
        while(i<needle.length() && j< haystack.length()){
            if(needle.charAt(i)== haystack.charAt(j)){
                i++;
                j++;
                if(i==needle.length()){
                    return j- needle.length(); // index
                    // hello
                    // ll
                }
            }
            else{
                j=j-i+1; // backtrack to the position+1 where there was a problem match
                i=0;
            }
        }
        return -1;
    }
}