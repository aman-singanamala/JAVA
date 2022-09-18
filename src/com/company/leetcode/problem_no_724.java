package com.company.leetcode;

public class problem_no_724 {
    public static int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum= totalsum+nums[i];
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum = totalsum-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum=leftsum+nums[i];

        }
        return -1;
    }
}
