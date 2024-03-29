package com.company.Stack_and_Queue;

import java.util.Stack;

public class _1_ {
    // Push element on the top of the stack
    static void stack_push(Stack<Integer> stack){
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }
    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack){
        System.out.println("Pop Operation");
        for (int i = 0; i < 5; i++) {
            Integer y=(Integer) stack.pop();
            System.out.print(y+" ");
        }
    }
    // Display element on the top of the stack
    static void stack_peek(Stack<Integer> stack){
        Integer element= (Integer) stack.peek();
        System.out.println();
        System.out.println("Element on stack top: "+element);
    }
    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element){
        Integer pos = (Integer) stack.search(element);
        if(pos==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is found at position: "+pos);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        stack_push(s);
        stack_pop(s);
        stack_push(s);
        stack_peek(s);
        stack_search(s,3);
        stack_search(s,6);



    }
}
