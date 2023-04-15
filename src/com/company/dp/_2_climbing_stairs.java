package com.company.dp;

public class _2_climbing_stairs {
    public static int f(int index, int[] heights, int[] dp) { // memorization
        if (index == 0) {
            return 0;
        }

        if (dp[index] != 0) {
            return dp[index];
        }

        int left = f(index - 1, heights, dp) + Math.abs(heights[index] - heights[index - 1]);
        int right = Integer.MAX_VALUE;
        if (index > 1) right = f(index - 2, heights, dp) + Math.abs(heights[index] - heights[index - 2]);

        dp[index] = Math.min(left, right);
        return dp[index];


    }




    public static int frogJump(int n, int[] heights) {

        int[] dp = new int[n + 1];
        return f(n - 1, heights, dp);

    }

}