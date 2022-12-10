package com.company.Trees;

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


    









}