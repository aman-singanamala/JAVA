package com.company.leetcode;

public class problem_no_1929 {
    public int[] getConcatenation(int[] nums){
        int[] temp=new int[nums.length*2];
        int j=0;
        for(int i=0;i< nums.length;i++){
            temp[j++]=nums[i];
        }
        for(int i=0;i< nums.length;i++){
            temp[j++]=nums[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] a={1,2,1};
        problem_no_1929 ob= new problem_no_1929();
        int[] ans= ob.getConcatenation(a);
        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
