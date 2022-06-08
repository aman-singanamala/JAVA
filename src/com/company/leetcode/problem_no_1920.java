package com.company.leetcode;

public class problem_no_1920 {
    public int[] buildArray(int[] nums){
        int[] temp= new int[nums.length];
        int index=0;
        for(int i=0;i< nums.length;i++){
            temp[index++]=nums[nums[i]];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] a={0,2,1,5,3,4};
        problem_no_1920 ob= new problem_no_1920();
        int[] ans=ob.buildArray(a);
         for(int i=0;i<ans.length;i++){
             System.out.print(ans[i]+" ");
         }
    }

}
