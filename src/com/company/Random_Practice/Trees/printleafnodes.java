package com.company.Random_Practice.Trees;

public class printleafnodes {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val= val;
        }
    }

    static void printleafnodes_func(TreeNode root){
        // if root is null
        if(root==null){
            return;
        }

        // if the tree has only one node

        if(root.left==null && root.right==null){
            System.out.println(root.val);
            return;
        }

        //if left child exist, chech for leaf node recursively
        if(root.left!=null){
            printleafnodes_func(root.left);
        }

        // if right child exists, check for lead node recursively
        if(root.right!=null){
            printleafnodes_func(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);


        printleafnodes_func(root);
    }
}
