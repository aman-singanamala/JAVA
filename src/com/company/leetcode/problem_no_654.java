package com.company.leetcode;

import com.sun.source.tree.Tree;

import java.util.Arrays;

public class problem_no_654 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    static int returnmaxIndex(int[] nums){
        int index = 0;
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>maxi){
                maxi=nums[i];
                index=i;
            }

        }
        return index;
    }

    public TreeNode construct(int[] arr){
        if(arr==null || arr.length==0){
            return null;
        }
        int index= returnmaxIndex(arr);

        TreeNode root= new TreeNode(arr[index]);
        root.left= construct(Arrays.copyOfRange(arr, 0, index));
        root.right=construct(Arrays.copyOfRange(arr,index+1, arr.length));

        return root;

    }




    public static void main(String[] args) {
        int[] arr={1,2,8,3,6,4,5};
        int ans= returnmaxIndex(arr);
        System.out.println(ans);
    }
}
