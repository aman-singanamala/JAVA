package com.company.Trees;

public class BoundaryTraversal {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static void printLeftBoundary(TreeNode root) {
        if (root != null) {
            // if root has a left child, print it and recurse on the left subtree
            if (root.left != null) {
                System.out.print(root.val + " ");
                printLeftBoundary(root.left);
            }
            // if root does not have a left child, but has a right child,
            // print it and recurse on the right subtree
            else if (root.right != null) {
                System.out.print(root.val + " ");
                printLeftBoundary(root.right);
            }
        }
    }

    static void printRightBoundary(TreeNode root) {
        if (root != null) {
            // if the node has a right child, recurse on the right subtree and then print it
            if (root.right != null) {
                printRightBoundary(root.right);
                System.out.print(root.val + " ");
                // if the node does not have a right child, but has a left child, recurse on the left subtree and then print it
            } else if (root.left != null) {
                printRightBoundary(root.left);
                System.out.print(root.val + " ");
            }
        }
    }

    static void printLeafNodes(TreeNode root) {
        if (root != null) {
            printLeafNodes(root.left);
            if (root.left == null && root.right == null) {
                System.out.print(root.val + " ");
            }
            printLeafNodes(root.right);
        }
    }

    static void printBoundary(TreeNode root) {

        if (root != null) {
            System.out.print(root.val + " ");
            printLeftBoundary(root.left);
            printLeafNodes(root.left);
            printLeafNodes(root.right);
            printRightBoundary(root.right);
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

/*

                 1
                / \
               2   3
              / \   \
             4   5   7
                /
                8
               / \
              6   9
                   \
                   10

*/


        printBoundary(root);
    }
}
