package com.company.Trees.Easy;
// Calculate depth of a full Binary tree from Preorder and inorder

public class _2_construct {
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static Node fromInorder(int[] preorder, int[] inorder){
        if(preorder==null || inorder==null){
            return null;
        }
        helper(0,0, inorder.length -1,preorder,inorder);
         return null;

    }
    static Node helper(int preStart,
                       int inStart,
                       int inEnd,
                       int[] preorder,
                       int[] inorder){
        if(preStart> preorder.length-1 || inStart>inEnd){
            return null;
        }
        Node root= new Node(preorder[preStart]);
        int inIndex=0;
        for (int i = inStart; i < inEnd; i++) {
            if(root.val==inorder[i]){
                inIndex=i;
            }
        }
        root.left= helper(preStart+1, inStart, inIndex-1, preorder, inorder);
        root.right= helper(preStart+inIndex-inStart+1, inIndex+1,inEnd, preorder, inorder);

        return root;

    }

}
