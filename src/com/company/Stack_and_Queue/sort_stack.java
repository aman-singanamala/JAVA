package com.company.Stack_and_Queue;

import java.util.*;
public class sort_stack {
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> aux_stack= new Stack<>();

        while(!stack.isEmpty()){
            int temp= stack.pop();

            while(!aux_stack.isEmpty() && aux_stack.peek()> temp){
                stack.push(aux_stack.pop());
            }

            aux_stack.push(temp);
        }

        while(!aux_stack.isEmpty()){
            stack.push(aux_stack.pop());
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(5);
        s.push(9);
        s.push(8);
        s.push(1);
        s.push(-1);
        s.push(-99);
        s.push(100);

        sortStack(s);
    }
}