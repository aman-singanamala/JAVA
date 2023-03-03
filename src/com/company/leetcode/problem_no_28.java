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
            } else {
                j = j - i + 1; // backtrack to the position+1 where there was a problem match
                i = 0;
            }
        }
        return -1;
    }

    // brute force


    public static int findIndex(String str, String subStr) {
        int n = str.length(); // get the length of the main string
        int m = subStr.length(); // get the length of the substring we're looking for

        // loop through the main string, starting at index 0 and going to n - m
        // (we don't need to check beyond n - m because there won't be enough characters left
        // in the main string to match the substring)
        for (int i = 0; i <= n - m; i++) {
            int j;
            // loop through the substring and check if each character matches the corresponding
            // character in the main string starting at index i + j
            for (j = 0; j < m; j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    // if we find a character that doesn't match, break out of the inner loop
                    // and start checking the next character in the main string
                    break;
                }
            }
            // if j == m, it means we've gone through the entire substring and all the characters
            // matched, so we've found the starting index of the substring in the main string
            if (j == m) {
                return i;
            }
        }
        // if we've gone through the entire main string and haven't found the substring, return -1
        return -1;
    }

}