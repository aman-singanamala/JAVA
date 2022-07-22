package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem_no_18 {
    public List<List<Integer>> fourSum(int[] nums,int target){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(nums==null|| nums.length<4){
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                for (int k = j+1; k < nums.length ; k++) {

                }
            }
        }
        
        
        
        
        
        
        return result;
        
        
    }
}
