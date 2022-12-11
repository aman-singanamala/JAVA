package com.company.Random_Practice;

public class TT {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data < val) {
            root.left = insert(root.left, val);
        } else if (root.data > val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    static void preorder(Node root) {
        // base case
        if (root == null) {
            return;
        }
        //print the data of the current node
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root){
        //base case
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    static void postorder(Node root){
        //base case
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        // create the following binary tree
        //   1
        //  / \
        // 2   3
        //    / \
        //   4   5
        System.out.print("Pre-order: ");
        preorder(root);
        System.out.println();
        System.out.print("In-order: ");
        inorder(root);
        System.out.println();
        System.out.print("Post-order: ");
        postorder(root);
    }
}
