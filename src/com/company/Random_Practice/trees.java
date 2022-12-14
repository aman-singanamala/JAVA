package com.company.Random_Practice;

import java.util.*;

public class trees {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    static void preorderR(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preorderR(root.left);
        preorderR(root.right);
    }
    static void intOrderR(Node root){
        if(root==null){
            return;
        }
        intOrderR(root.left);
        System.out.print(root.val);
        intOrderR(root.right);
    }
    static void postOrderR(Node root){
        if(root==null){
            return;
        }
        postOrderR(root.left);
        postOrderR(root.right);
        System.out.println(root.val);
    }

    static void bfs(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();

            for (int i = 0; i < size; i++) {
                Node curr= queue.remove();
                System.out.print(curr.val+" ");

                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
        }
    }
    static void preorderI(Node root){
        if(root==null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            Node node= stack.pop();
            System.out.print(node.val+" ");

            // if the popped element has a right
            if(node.right!=null){
                stack.push((node.right));
            }
            // if the popped element has a left
            if(node.left!=null){
                stack.push(node.left);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        bfs(root);
    }

}
