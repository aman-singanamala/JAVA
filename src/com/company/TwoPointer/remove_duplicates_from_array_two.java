package com.company.TwoPointer;
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// https://www.youtube.com/watch?v=OZaADxYTfD4
public class remove_duplicates_from_array_two {
    public int removeDuplicates(int[] nums){
        if (nums.length < 3) {
            return nums.length;
        }
        int in=2; // 3rd index
        for(int i=2;i< nums.length;i++){
            if(nums[i]!=nums[in-2]){  // comparing
                nums[in++]= nums[i];
            }
        }
        return in;

    }
}