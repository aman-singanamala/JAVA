package com.company.leetcode;
public class problem_no_2331 {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static boolean evaluateTree(Node root) {
        // If the root is a leaf, return its value as a boolean.
        if(root.left == null && root.right == null) {
            return root.data == 0 ? false : true;
        }
        // If the root value is 2, evaluate the left and right subtrees using OR (||) and return the result.
        else if(root.data == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        }
        // Otherwise, evaluate the left and right subtrees using AND (&&) and return the result.
        return evaluateTree(root.left) && evaluateTree(root.right);
    }
}
