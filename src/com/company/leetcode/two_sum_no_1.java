package com.company.leetcode;
import java.util.Arrays;

public class two_sum_no_1 {
    public static void main(String[] args) {
        int[] a={2,3,4};
        int target=6;
        int[] ans=func(a,target);
        System.out.println(Arrays.toString(ans));
    }
    public static  int[] func(int[] nums,int target){
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if((i!=j)&& nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
}
