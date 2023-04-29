package com.company.Random_Practice.exams;

import java.util.Scanner;
import java.util.Stack;

public class Q10 {
    static boolean balanced(String input){
        Stack<Character> stack= new Stack<>();
        for(char c:input.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top= stack.pop();
                if((c==')' && top!='(') || (c==']' && top!='[') ||  (c=='}' && top!='{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();
        boolean ans= balanced(input);
        System.out.println(ans);

    }

}