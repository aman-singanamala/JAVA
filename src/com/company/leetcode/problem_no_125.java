package com.company.leetcode;

public class problem_no_125 {
    public boolean isPalindrome(String s){
        int left;
        int right;
        char leftchar;
        char rightchar;
        left=0;
        right=s.length()-1;
        while (left<=right){
            leftchar=s.charAt(left);
            rightchar=s.charAt(right);
            if(!Character.isLetterOrDigit(leftchar)){
                left++;
            } else if (!Character.isLetterOrDigit(rightchar)) {
                right--;
            }
            else{
                if (Character.isLetterOrDigit(leftchar) != Character.isLetter(rightchar)) {
                    return false;

                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        problem_no_125 ob = new problem_no_125();
        boolean ans = ob.isPalindrome("an apple, :) elp pana#");
        System.out.println(ans);
    }

}
