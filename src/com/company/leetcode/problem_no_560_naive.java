package com.company.leetcode;

public class problem_no_560_naive {
    public int subarraySum(int[] nums,int k){
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j< nums.length;j++){
                sum=sum+nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        problem_no_560_naive ob= new problem_no_560_naive();
        int[] a ={1,2,3};
        int ans= ob.subarraySum(a,2);
        System.out.println(ans);

    }
}
