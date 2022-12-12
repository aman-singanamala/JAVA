package com.company.Stack_and_Queue.queue_tut;

import java.util.LinkedList;
import java.util.Queue;

public class inbuilt_Examples {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // peek just gets the item but not remove
        System.out.println(queue.peek());

        // remove removes the item from the queue
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
