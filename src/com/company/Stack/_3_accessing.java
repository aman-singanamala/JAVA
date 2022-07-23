package com.company.Stack;

import java.util.Stack;

public class _3_accessing {
    public static void main(String[] args) {
        Stack<String>  stack = new Stack<>();
        Stack<Integer>  stack1 = new Stack<>();
        stack.push("Hello");
        stack.push("Aman");
        stack.push("Singanamala");
        stack.push("okok...");
        // Display the stack
        System.out.println("Initial Stack:"+stack);
        // Get the element at the top
        System.out.println("The element at the top of the stack is :"+stack.peek());
        System.out.println("Final Stack:"+stack);


        stack1.push(10);
        stack1.push(15);
        stack1.push(30);
        stack1.push(20);
        stack1.push(5);

        System.out.println("Initial Stack:"+stack1);
        System.out.println("Pooped Element : "+stack1.pop());
        System.out.println("Pooped Element : "+stack1.pop());
        System.out.println("Final stack is : "+stack1);



    }
}
