package com.company.Random_Practice;

import java.util.*;
import java.lang.*;

import java.util.LinkedList;
import java.util.Stack;

public class exam {
    public static boolean checkPalindrome(String s){
        Stack<Character> stack = new Stack<>();
        LinkedList<Character> queue=new LinkedList<>();

        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
            queue.add(s.charAt(i));

        }
        while(!stack.isEmpty()){
            if(stack.pop()!= queue.remove()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string:");
        s= in.next();
        boolean ans= checkPalindrome(s);
        if(ans==true){
            System.out.println("Palindriome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }


}
