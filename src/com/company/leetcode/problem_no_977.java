package com.company.leetcode;
import java.util.Arrays;
public class problem_no_977 {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i< nums.length;i++){
            nums[i]= (nums[i]*nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        int[] a={-4,-1,0,3,10};
        problem_no_977 ob= new problem_no_977();
        int[] ans = ob.sortedSquares(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }


}
