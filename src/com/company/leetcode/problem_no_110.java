package com.company.leetcode;



public class problem_no_110 {
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
    public boolean isBalanced(Node root) {
        if(root==null){
            return true;
        }
        int leftheight= height(root.left);
        int rightheight= height(root.right);

        int diff= Math.abs(leftheight-rightheight);
        if(diff>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh= height(root.left);
        int rh= height(root.right);

        return 1+ Math.max(lh,rh);
    }
}