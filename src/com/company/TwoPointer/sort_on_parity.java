package com.company.TwoPointer;

import com.company.leetcode.problem_no_905;

public class sort_on_parity {
    public int[] sortArrayByParity(int[] nums){
        int n= nums.length;
        int i=0;
        int j=n-1;

        while(i<j){
            if(nums[i]%2==0){
                i++;
            }
            else{
                if(nums[j]%2==0){
                    int temp= nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                j--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        sort_on_parity ob = new sort_on_parity();
        int[] a= {3,1,2,4};
        int[] res= ob.sortArrayByParity(a);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}