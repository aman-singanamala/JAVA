package com.company.leetcode;

public class problem_no_917 {
    public String reverseOnlyLetters(String s){
        int n=s.length() ;
        int i=0;
        int j=n-1;
        char[] str= s.toCharArray();
        while(i<=j){
            if(Character.isAlphabetic(str[i])){
                if(Character.isAlphabetic(str[j])){
                    char c= str[i];
                    str[i]= str[j];
                    str[j]= c;
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        }
        return String.copyValueOf(str);
    }

    public static void main(String[] args) {
        problem_no_917 ob= new problem_no_917();
        String a= "ab-cd";
        System.out.println(ob.reverseOnlyLetters(a));

    }
}