package com.company.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class problem_no_102 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    static List<List<Integer>> bfs(Node root){
        List<List<Integer>> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size= queue.size();
            List<Integer> currentlevel= new ArrayList<>();
            for(int i=0;i<size;i++){
                Node current= queue.remove();
                currentlevel.add(current.data);

                // Add the node's children (if any) to the queue
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add((current.right));
                }
            }
            result.add(currentlevel);
        }
        return result;
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
        List<List<Integer>> lists = bfs(root);
        for (List<Integer> list : lists) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
