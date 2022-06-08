package com.company.leetcode;

public class problem_no_1480 {
    public int[] runnigSum(int[] nums){
        int[] temp = new int[nums.length];
        int j=0;
        int sum=0;
        for(int i=0;i< nums.length;i++){
            sum=sum+nums[i];
            temp[j++]=sum;
        }
        return temp;
    }

    public static void main(String[] args) {
        problem_no_1480 ob= new problem_no_1480();
        int[] a= {1,1,1,1};
        int[] ans= ob.runnigSum(a);
        for(int i=0;i< a.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
