package com.company.leetcode;

public class problem_no_283 {
    public void moveZeros(int[] nums){
        if(nums.length == 0){
            return;
        }
        int index=0;
        for(int i=0;i< nums.length;i++) {
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }
        while(index< nums.length){
            nums[index++]=0;
        }
        for(int i=0;i<index;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        problem_no_283 ob= new problem_no_283();
        int[] a= {0,1,0,3,12};
        ob.moveZeros(a);
    }
}
