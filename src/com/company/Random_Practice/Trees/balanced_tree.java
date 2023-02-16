package com.company.Random_Practice.Trees;

public class balanced_tree {
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


    static boolean balanced(Node root){
        if(root==null){
            return true;
        }

        int leftheight= getHeight(root.left);

        int rightheight= getHeight(root.right);


        if(Math.abs(leftheight- rightheight)>1){
            return false;
        }
// Recursively check if both the left and right subtrees are balanced
        return balanced(root.left) && balanced(root.right);
    }
    static int getHeight(Node root){
        if(root==null){
            return 0;
        }

        int lh= getHeight(root.left);
        int rh= getHeight(root.right);

        return Math.max(lh,rh)+1;
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

        boolean ans= balanced(root);
        System.out.println(!ans ? "Not balanced" : "It is balanced");
    }
}
