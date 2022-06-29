package com.company.leetcode;

public class problem_no_9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int reversed = 0;
        while (temp != 0) {
            reversed = reversed * 10 + reversed % 10;
            temp/= 10;
        }
        return x== reversed;
    }



    public static void main(String[] args) {
        problem_no_9 ob= new problem_no_9();
        boolean ans= ob.isPalindrome(919);
        System.out.println(ans);
    }
}
