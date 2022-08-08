package com.company.sliding_window;
// https://leetcode.com/problems/implement-strstr/
public class substring {
    //Given two strings needle and haystack, return the index of the first occurrence of needle in haystack
    // , or -1 if needle is not part of haystack.
    public int strStr(String haystack, String needle) {
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