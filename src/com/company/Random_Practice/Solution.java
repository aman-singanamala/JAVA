package com.company.Random_Practice;

import java.util.Arrays;

public class Solution {
    public long[] optimalArray(int n, long[] a)
    {
        long[] ans= new long[n];
        int k=0;
        int i=0;
        while(i<n){
            ans[k++]= a[i++]-1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution ob= new Solution();
        long [] arr= {1,1,1,7,7,10,19};
        long[] ans = ob.optimalArray(7, arr);
        System.out.println(Arrays.toString(ans));
    }
}