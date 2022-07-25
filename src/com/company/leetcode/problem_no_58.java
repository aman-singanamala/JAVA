package com.company.leetcode;

public class problem_no_58 {
    public int lengthOfLastWord(String s){
        String str= s.trim();
        String[] a = str.split(" ");
        return a[a.length-1].length();
    }

    public static void main(String[] args) {
        problem_no_58 ob = new problem_no_58();
        int ans=ob.lengthOfLastWord("Hello World");
        System.out.println(ans);
    }
}
