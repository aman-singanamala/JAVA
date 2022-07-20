package com.company.leetcode;
public class problem_no_2108 {
    public String firstPalindrome(String[] words){

        for (int i=0;i<words.length;i++){
            if(!isPalindrome(words[i])){
                continue;
            }
            else{
                return words[i];
            }
        }
        return "";
    }
    static boolean isPalindrome(String str){
        boolean flag= true;
        String temp="";
        for(int i=str.length()-1;i>=0;i--){
            temp=temp+str.charAt(i);
        }
        if(!str.equals(temp)){
            flag= false;
        }
        else{
            flag= true;
        }
        return flag;
    }

    public static void main(String[] args) {
        problem_no_2108 ob = new problem_no_2108();
        String[] s= {"abc","car","ada","racecar","cool"};
        String ans = ob.firstPalindrome(s);
        System.out.println(ans);
    }
}
