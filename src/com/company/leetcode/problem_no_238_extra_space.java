package com.company.leetcode;

public class problem_no_238_extra_space {
    public int[] productExceptSelf(int[] nums) {
        int output[] = new int[nums.length];
        output[0]=1;

        return output;
    }

    public static void main(String[] args) {
        problem_no_238_extra_space ob= new problem_no_238_extra_space();
        int[] a ={1,2,3,4};
        int[] ans = ob.productExceptSelf(a);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
