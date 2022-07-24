package com.company.leetcode;

public class problem_no_2000 {
    public String reversePrefix(String word,char ch){
        char[] a = word.toCharArray();
        int count=0;
        for (int i = 0; i < word.length(); i++) {
            if (a[i] == ch) {
                count = i;
                break;
            }
        }
        int start=0;
        int end= count;
        while(start<=end){
            char temp= a[start];
            a[start]= a[end];
            a[end]= temp;
            start++;
            end--;
        }
        return String.valueOf(a);
    }

    public static void main(String[] args) {
        problem_no_2000 ob = new problem_no_2000();
        String ans = ob.reversePrefix("abcdefd",'d');
        System.out.println(ans);
    }
}
