package com.company.leetcode;

public class problem_no_1672 {
    public int maximumWealth(int[][] accounts){
        int wealth=0;
        for(int i=0;i< accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            if(sum>wealth){
                wealth=sum;
            }
        }
        return wealth;
    }

    public static void main(String[] args) {
        problem_no_1672 ob = new problem_no_1672();
        int[][] a={
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        int ans=ob.maximumWealth(a);
        System.out.println(ans);
    }
}
