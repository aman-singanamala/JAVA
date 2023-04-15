package com.company.leetcode;

import java.util.Stack;

public class problem_no_2390 {
    public String removeStars(String str){
        Stack<Character> stack= new Stack<>();

        for(char c: str.toCharArray()){
            if(c=='*'){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        String ans= "";

        for(char c: stack){
            ans= ans+c;
        }

        return ans;

    }
}