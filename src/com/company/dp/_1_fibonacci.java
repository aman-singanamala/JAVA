package com.company.dp;

public class _1_fibonacci {
    public static void main(String[] args) {
        int n=11;
        int[] dp= new int[n+1];

        for (int i = 0; i <=n; i++) {
            System.out.print(f_t(i)+" ");
        }
    }
    private static int f(int n, int[] dp){
        if(n<=1){
            return n;
        } else if (dp[n]!=0) {
            return dp[n];
        }else{
            dp[n]= f(n-1, dp)+ f(n-2, dp);
        }

        return dp[n];
    }

    private static int f_t(int n){
        if(n==0 || n==1){
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

    private static int f_ts(int n){
        if(n==0 || n==1){
            return n;
        }

        int prev2=0;
        int prev1=1;
        int fib=0;
        for (int i = 2; i <=2; i++) {
            fib= prev1+prev2;
            prev2=prev1;
            prev1=fib;
        }
        return fib;
    }

}