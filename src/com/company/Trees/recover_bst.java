package com.company.Trees;


import com.sun.source.tree.Tree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class recover_bst {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform an inorder traversal of the tree and print out the values
        System.out.println("Inorder Traversal:");
        inorder(root);
    }

    public static void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);
    }


    public void swapnodes(TreeNode node1, TreeNode node2){
        int temp= node1.val;
        node1.val= node2.val;
        node1.val= temp;
    }
}