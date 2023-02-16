package com.company.Random_Practice.Trees;

public class diameter_of_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left= null;
            this.right= null;
        }
    }

    public int getDiameter(Node root){
        int[] diameter= new int[1];
        // Calling the helper function to calculate the height of the tree
        // and updating the diameter at the same time
        getHeight(root, diameter);
        return diameter[0];
    }



    private static int getHeight(Node root, int[] diameter){
        if(root==null){
            return 0;
        }
        int lh= getHeight(root.left, diameter);
        int rh= getHeight(root.right, diameter);
        // Update the diameter by taking the maximum value between the current diameter and
        // the sum of the heights of the left and right subtrees
        diameter[0]= Math.max(diameter[0],lh+rh);
        // return the height of the current node by taking the maximum value between
        // he left and right subtrees
        // and adding 1  ( to account for the current node
        return 1+ Math.max(lh,rh);
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
    }
}
