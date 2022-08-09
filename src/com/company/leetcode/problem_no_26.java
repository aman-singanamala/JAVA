package com.company.leetcode;
public class problem_no_26 {
    public int removeDuplicates(int[] nums){
        if(nums.length==0||nums.length==1){
            return nums.length;
        }
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 4, 4, 4, 5, 5};
        problem_no_26 ob= new problem_no_26();
        int ans= ob.removeDuplicates(a);
        System.out.println(ans);
    }
}