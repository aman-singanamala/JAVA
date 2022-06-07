package com.company.leetcode;

public class problem_no_1295 {
    public int findNumbers(int[] nums){
        int k=0;
        for (int num : nums) {
            if (even(num)) {
                k++;
            }

        }
        return k;
    }
    static boolean even(int n){
        boolean ans= true;
        int count=0;
        while(n>0){
            count=count+1;
            n=n/10;
        }
        if(count%2==0){
            ans =true;
        }
        else{
            ans=false;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={555,901,482,1771};
        int[] b={12,345,2,6,7896};
        problem_no_1295 ob= new problem_no_1295();
        int ans1=ob.findNumbers(a);
        int ans2=ob.findNumbers(b);
        System.out.println(ans1);
        System.out.println(ans2);
    }

}
