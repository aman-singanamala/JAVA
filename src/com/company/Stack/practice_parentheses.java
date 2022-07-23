package com.company.Stack;

import java.util.Stack;
public class practice_parentheses {
    public static boolean isValid(String s){
        Stack<Character> stack= new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i)=='(')|| (s.charAt(i)=='{')||(s.charAt(i)=='[')){
                stack.push(s.charAt(i));
            }
            else {
                if(stack.empty()){
                    return false;
                }
                char c= stack.pop();
                if((c=='(' && s.charAt(i)==')')||(c=='{' && s.charAt(i)=='}')||(c=='[' && s.charAt(i)==']')){
                    continue;
                }
                else return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {

        String s= "(){}[{}]{";
        boolean ans = isValid(s);
        if (ans){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Unbalanced");
        }
    }
}
