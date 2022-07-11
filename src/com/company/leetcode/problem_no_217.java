package com.company.leetcode;

import java.util.HashSet;

public class problem_no_217 {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;


    }

    public static void main(String[] args) {
        problem_no_217 ob= new problem_no_217();
        int[] a= {1,1,1,3,3,4,3,2,4,2};
        boolean ans = ob.containsDuplicate(a);
        System.out.println(ans);



    }
}
