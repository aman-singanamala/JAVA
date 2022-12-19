package com.company.leetcode;

import javax.swing.tree.TreeNode;

public class problem_no_543 {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int heightviaroot=height(root.left)+height(root.right);
        int heightNotviaRoot= Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        return Math.max(heightviaroot,heightNotviaRoot);
    }
    static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh= height(root.left);
        int rh= height(root.right);

        return 1+Math.max(lh,rh);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.right.right = new TreeNode(7);

        int ans= diameterOfBinaryTree(root);
        System.out.println(ans);

    }
}
