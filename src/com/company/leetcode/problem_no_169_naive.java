package com.company.leetcode;

public class problem_no_169_naive {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        int maxCount=0;
        int index=-1;
        for(int i=0;i< nums.length;i++){
            int count=0;
            for(int j=0;j< nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                index=i;
            }
        }
        return nums[index];
    }

    public static void main(String[] args) {
        problem_no_169_naive ob= new problem_no_169_naive();
        int[] a={2,2,1,1,1,2,2};
        int ans= ob.majorityElement(a);
        System.out.println(ans);
    }

}
