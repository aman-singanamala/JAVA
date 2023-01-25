package com.company.Random_Practice.exams;

import java.util.Scanner;
import java.util.Stack;

public class max_stack {
    static int findMax(Stack<Integer> stack){
        int max= Integer.MIN_VALUE;
        for(int i : stack){
            if(i>max){
                max=i;
            }
        }
        return max;

    }
    public static void main(String[] args){
        Stack<Integer> stack= new Stack<>();
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=0;i<n;i++){
            int ele= in.nextInt();
            stack.push(ele);
        }
        int max= findMax(stack);
        System.out.println(max);
    }
}
