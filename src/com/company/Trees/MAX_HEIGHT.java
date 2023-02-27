package com.company.Trees;

public class MAX_HEIGHT {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data= data;
            this.left=null;
            this.right= null;
        }
    }
    static int maxDepth(Node root){
        //base condition
        if(root==null){
            return 0;
        }
        int lh= maxDepth(root.left);
        int rh= maxDepth(root.right);

        return 1+ Math.max(lh, rh);
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

        int ans= maxDepth(root);
        System.out.println(ans);
    }


}
