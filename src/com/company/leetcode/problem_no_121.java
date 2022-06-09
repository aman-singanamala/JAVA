package com.company.leetcode;

public class problem_no_121 {
    public int maxProfit(int[] prices){
        int min_prize=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            min_prize=Math.min(prices[i],min_prize);
            profit=Math.max(profit,prices[i]-min_prize);
        }
            return profit;
    }

    public static void main(String[] args) {
        problem_no_121 ob= new problem_no_121();
        int[] a = {7,1,5,3,6,4};
        int ans= ob.maxProfit(a);
        System.out.println(ans);
    }
}
