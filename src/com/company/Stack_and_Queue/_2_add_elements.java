package com.company.Stack_and_Queue;

import java.util.Stack;

public class _2_add_elements {
    public static void main(String[] args){
        // Default
        Stack stack1= new Stack();

        //Initialization of stack using generics
        Stack<String> stack2= new Stack<>();
        stack1.push(105);
        stack1.push("Aman");
        stack1.push("Singanamala");

        stack2.push("Hello");
        stack2.push("EveryOne");

        System.out.println(stack1);
        System.out.println(stack2);
    }
}
