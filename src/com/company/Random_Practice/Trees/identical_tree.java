package com.company.Random_Practice.Trees;

public class identical_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;

        }
    }
    static boolean identical_check(Node p, Node q){
        if(p==null || q==null){
            return (p==q);
        }
        return (p.data == q.data) && identical_check(p.left, q.left) && identical_check( p.right, q.right);
    }
}
