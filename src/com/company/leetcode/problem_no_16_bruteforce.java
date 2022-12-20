package com.company.leetcode;

public class problem_no_16_bruteforce {
    public static int threeSumClosest(int[] nums, int target) {
        int n= nums.length;
        int closestSum= nums[0]+nums[1]+nums[2];
        int diff= Math.abs(closestSum-target);
        for(int i=0;i< n-2;i++){
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum=nums[i]+nums[j]+nums[k];
                    int newdiff= Math.abs(sum-target);
                    if(newdiff<diff){
                        diff=newdiff;
                        closestSum=sum;
                    }
                }
            }
        }
        return closestSum;
    }
}
