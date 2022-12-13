package com.company.Trees;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {

    class Node
    {
        int data;
        Node left, right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public Node insert(Node root, int value) {
        // if the root is null. create a new node and return it.
        if (root == null) {
            root = new Node(value);
            return root;
        }
        // if the data is smaller than the root's data, recur for left subtree
        if (value < root.data) {
            root.left = insert(root.left, value);
        }
        // if the data is greater than the root's data, recur for right subtree
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    static void inorderTraversal(Node root){
        // create an empty stack
        Stack<Node> stack= new Stack<Node>();
        Node curr= root;

        // while the stack is not empty, or the current node is not null
        while(curr!=null || !stack.empty()){
            // if the curr is not null, push it to the stack and move to its left child
            if(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }

            // if the current node is null, we pop the node from the stack,
            // print its value, and then move to its right child

            else{
                Node node = stack.pop();
                System.out.print(node.data+" ");
                curr=node.right;
            }
        }
    }
    static void preorderTraversal(Node root){
        // create an empty stack
        Stack<Node> stack= new Stack<>();
        // push the root node to the stack
        stack.push(root);


        // while the stack is not empty
        while(!stack.empty()) {
            Node node = stack.pop();
            System.out.print(node.data + " ");


            // push the right element of the popped node to the stack if it exists
            if (node.right != null) {
                stack.push(node.right);
            }
            // push the left child of the popped node to the stack if it exists
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }


    









}