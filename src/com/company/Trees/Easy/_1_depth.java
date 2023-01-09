package com.company.Trees.Easy;

public class _1_depth {
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    static int depth(Node root){
        if(root==null){
            return 0;
        }
        int lh= depth(root.left);
        int rh= depth(root.right);

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

        int ans= depth(root);
        System.out.println(ans);


    }
}
