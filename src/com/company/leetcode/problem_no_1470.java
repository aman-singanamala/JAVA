package com.company.leetcode;

public class problem_no_1470 {
    public int[] shuffle(int[] nums,int n){
        int[] shuffledArray=new int[nums.length];
        for(int i=0;i<n;i++){
            shuffledArray[2*i]=nums[i];
            shuffledArray[2*i+1]=nums[i+n];
        }
        return shuffledArray;
    }
    public static void main(String[] args) {
        int[] a= {2,5,1,3,4,7};
        problem_no_1470 ob= new problem_no_1470();
        int[] ans=ob.shuffle(a,3);
        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i]);
        }
    }
}
