package com.company.leetcode;

public class problem_no_53 {
    public int maxSubArray(int[] nums){
        int current_sum=nums[0];
        int max_so_far=nums[0];
        for(int i=1;i<nums.length;i++){
            current_sum=Math.max(nums[i],current_sum+nums[i]);
            max_so_far=Math.max(current_sum,max_so_far);
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int[] a ={-2,1,-3,4,-1,2,1,-5,4};
        problem_no_53 ob= new problem_no_53();
        int ans= ob.maxSubArray(a);
        System.out.println(ans);
    }
}
