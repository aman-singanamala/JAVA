package com.company.Stack_and_Queue;

import java.util.Stack;

public class _6_queue_using_stack {

}

class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int item) {
        first.push(item);
    }

    public int pop() {
        while (!first.isEmpty()) {
            // remove from first and put it in second
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }


    public int peek() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean isEmpty() {
        return first.isEmpty() && second.isEmpty();
    }
}