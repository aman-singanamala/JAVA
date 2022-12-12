package com.company.Stack_and_Queue.stack_tut;
// https://www.youtube.com/watch?v=rHQI4mrJ3cg&t=2342s
import java.util.Stack;
public class inbuilt_Examples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
