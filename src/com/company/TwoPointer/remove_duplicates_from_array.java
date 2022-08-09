package com.company.TwoPointer;
//26. Remove Duplicates from Sorted Array
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class remove_duplicates_from_array {
    public int removeDuplicates(int[] nums){
        if(nums.length==0|| nums.length==1){
            return nums.length;
        }
        int i=0;
        for(int j=0;i< nums.length;i++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}