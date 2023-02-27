package com.company.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class dfs {
    static ArrayList<Integer> dfs_traversal(Node root) {

        ArrayList<Integer> dfslist = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            dfslist.add(node.data);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }

        }
        return dfslist;
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

        ArrayList<Integer> dfslist=  dfs_traversal(root);
        System.out.println(dfslist);
    }


    static ArrayList<ArrayList<Integer>> levelordertraversal(Node root){
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        Queue<Node> q= new LinkedList<>();

        if(root==null){
            return result;
        }
        q.offer(root);
        while (!q.isEmpty()){
            ArrayList<Integer> sublist= new ArrayList<>();
            int size= q.size();


            for (int i = 0; i < size; i++) {
                Node node= q.poll();

                sublist.add(node.data);
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }


            result.add(sublist);
        }
        return result;
    }

}
