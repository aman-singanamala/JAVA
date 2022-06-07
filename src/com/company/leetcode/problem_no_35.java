package com.company.leetcode;

public class problem_no_35 {
    public int searchInsert(int[] nums,int target){
        for(int i=0;i< nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] a= {1,3,5,6};
        problem_no_35 ob=new problem_no_35();
        int ans1 =ob.searchInsert(a,5);
        System.out.println(ans1);
        int ans2=ob.searchInsert(a,2);
        System.out.println(ans2);
    }
}
