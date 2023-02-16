package com.company.leetcode;



class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data= data;
        this.left= null;
        this.right= null;
    }
}
public class problem_no_111 {
    public int minDepth(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        int leftDepth;
        int rightDepth;

        if(root.left!=null){
            leftDepth= minDepth(root.left);
        }
        else{
            leftDepth= Integer.MAX_VALUE;
        }

        if(root.right!=null){
            rightDepth= minDepth(root.right);
        }
        else{
            rightDepth= Integer.MAX_VALUE;
        }
        return 1+ Math.min(leftDepth, rightDepth);
    }
}
