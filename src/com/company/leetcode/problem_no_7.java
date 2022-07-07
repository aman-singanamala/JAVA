package com.company.leetcode;

public class problem_no_7 {
    public int reverse(int x){

        long rev=0;
        if(x==0){
            return 0;
        }
        while (x!=0){
            int r= x%10;
            rev=rev*10+r;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE|| rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int) rev;
    }

}
