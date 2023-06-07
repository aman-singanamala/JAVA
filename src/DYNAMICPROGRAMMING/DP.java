package DYNAMICPROGRAMMING;

import java.util.*;

public class DP {
    //-----------------------------------------------------------------------------
    public static int fib(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return calculateFibonacci(n, dp);
    }
    // memoization-recursive ( top down)
    private static int calculateFibonacci(int n, int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]= calculateFibonacci(n-1, dp)+calculateFibonacci(n-2, dp);
        return dp[n];
    }
    // tabulation (bottom-up)
    private static int calculateFib(int n){
        if(n<=1){
            return n;
        }
        int[] dp= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]= dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    // space omptimization
    private static int calculatefib_space(int n){
        if(n<=1){
            return n;
        }
        int a=0;
        int b=1;
        int result=0;
        for(int i=2;i<=n;i++){
            result= a+b;
            a=b;
            b=result;
        }
        return result;
    }
    //---------------------------------------------------------------------------


    //2. Count ways to reach the n'th stai


}
