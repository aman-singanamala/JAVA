package Trees;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // recursive
    static Node insert(Node root, int val) {
        if(root==null){
            return new Node(val);
        }
        if(val<root.data){
            root.left= insert(root.left,val);
        } else if (val>root.data) {
            root.right=insert(root.right,val);
        }
        return root;
    }

    // iterative
    static Node insertInto(Node root, int val){
        if(root==null){
            return new Node(val);
        }
        Node curr= root;
        while(true){
            if(val<curr.data){
                if(curr.left!=null){
                    curr= curr.left;
                }else{
                    curr.left= new Node(val);
                    break;
                }
            }else{
                if(curr.right!=null){
                    curr=curr.right;
                }else{
                    curr.right=new Node(val);
                    break;
                }
            }
        }

        return root;
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    static void BFS(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current= queue.poll();
            System.out.println(current);

            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
    }

    static boolean checkBST(Node root){

        return chechBSThelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    static boolean chechBSThelper(Node root, long min, long max){
        if(root==null){
            return true;
        }
        if(root.data<=min || root.data>=max){
            return false;
        }

        return chechBSThelper(root.left, min,root.data) && chechBSThelper(root.right, root.data, max);
    }

    static ArrayList<Integer> rightview(Node root){

        ArrayList<Integer> result= new ArrayList<>();
        rightviewhelper(root, result,0);
        return result;


    }

    static void rightviewhelper(Node root, ArrayList<Integer> result, int level){
        if(root==null){
            return;
        }
        if(level==result.size()){
            result.add(root.data);
        }

        rightviewhelper(root.right, result, level+1);
        rightviewhelper(root.left, result,level+1);

    }

    static void printLeftBoundary(Node node){
        if(node!=null){
            if(node.left!=null){
                System.out.print(node.data+" ");
                printLeftBoundary(node.left);
            }else{
                System.out.print(node.data+" ");
                printLeftBoundary(node.right);
            }

            // ignoring the leaf nodes
        }
    }

    static void printRightBoundary(Node node){
        if(node!=null){
            if(node.right!=null){
                printRightBoundary(node.right);
                System.out.print(node.data+" ");
            }else{
                printRightBoundary(node.left);
                System.out.print(node.data+" ");
            }
        }
    }

    static void printLeafNodes(Node node){
        if(node!=null){
            printLeafNodes(node.left);

            if(node.left==null && node.right==null){
                System.out.print(node.data+" ");
            }

            printLeafNodes(node.right);
        }
    }

    static void boundaryTraversal(Node node){
        if(node!=null){
            System.out.print(node.data+" ");
            printLeftBoundary(node.left);
            printLeafNodes(node.left);
            printLeafNodes(node.right);
            printRightBoundary(node.right);
        }
    }






}

public class Tree {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;

        System.out.println("DFS traversal:");
        Node.preorder(root);
    }
}
