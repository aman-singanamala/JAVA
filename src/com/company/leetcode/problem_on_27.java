package com.company.leetcode;

public class problem_on_27 {
    public int removeElement(int[] nums, int val) {
        int j=0;

        for(int i=0;i< nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        problem_on_27 ob = new problem_on_27();
        int[] a={0,1,2,2,3,0,4,2};
        int ans= ob.removeElement(a,2);
        System.out.println(ans);
    }
}
