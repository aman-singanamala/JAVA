package com.company.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class a {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data= data;
        }
    }
    public Node insert(Node root, int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left= insert(root.left, data);
        } else if (data> root.data) {
            root.right= insert(root.right, data);
        }
        return root;
    }
    // Preorder
    static void preorder(Node root){
        //base case
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder
    static void inorder(Node root){
        //base case
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //postorder
    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    // bfs
    static ArrayList<Integer> bfs(Node root){
        Queue<Node> queue= new LinkedList<>();
        queue.offer(root);
        ArrayList<Integer> result= new ArrayList<>();
        while(!queue.isEmpty()){

            Node node= queue.poll();
            result.add(node.data);
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }

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
        System.out.print("Pre-order: ");
        preorder(root);
        System.out.println();
        System.out.print("In-order: ");
        inorder(root);
        System.out.println();
        System.out.print("Post-order: ");
        postorder(root);
        System.out.println();
        System.out.print("BFS: ");
        ArrayList<Integer> ans= bfs(root);
        System.out.print(ans);
    }
}
