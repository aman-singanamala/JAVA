package com.company.leetcode;


public class problem_no_783 {
    Node prevNode = null;
    int minDistance= Integer.MAX_VALUE;
    public int minDiffInBST(Node root){
        inorder(root);
        return minDistance;
    }

    private void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        if(prevNode !=null){
            minDistance= Math.min(minDistance, node.data- prevNode.data);

        }
        prevNode=node;
        inorder(node.right);
    }

}
