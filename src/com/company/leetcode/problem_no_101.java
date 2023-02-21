package com.company.leetcode;
public class problem_no_101 {
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
    static boolean isSymmetric(Node root){
        if(root==null){
            return true;
        }
        return HelperFunction(root.left, root.right);
    }
    static boolean HelperFunction(Node left, Node right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.data!= right.data){
            return false;
        }
        return HelperFunction(left.left, right.right) && HelperFunction(left.right, right.left);
    }
}
