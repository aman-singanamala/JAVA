package com.company.leetcode;

public class problem_no_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp= new int[nums.length];
        for(int i=0;i< nums.length;i++){
             int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            temp[i]=count;
        }
        return temp;
    }

    public static void main(String[] args) {
        problem_no_1365 ob= new problem_no_1365();
        int[] a = {8,1,2,2,3};
        int[] ans= ob.smallerNumbersThanCurrent(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
