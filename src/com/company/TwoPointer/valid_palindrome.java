package com.company.TwoPointer;

public class valid_palindrome {
    public boolean isPalindrome(String s){
        int n=s.length();
        int i=0;
        int j=n-1;
        char left;
        char right;
        while(i<=j){
            left= s.charAt(i);
            right=s.charAt(j);
             if(!Character.isLetterOrDigit(left)){
                 i++;
             }
             if(!Character.isLetterOrDigit(right)){
                 j-- ;
             }
             else{
                if(Character.isLetterOrDigit(left)!=Character.isLetterOrDigit(right)){
                    return false;
                }
                i++;
                j--;
             }
        }
        return true;

    }
}