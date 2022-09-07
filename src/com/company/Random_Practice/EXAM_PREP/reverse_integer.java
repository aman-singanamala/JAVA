package com.company.Random_Practice.EXAM_PREP;

public class reverse_integer {
    public static int reverse(int n){
        long rev =0;
        if(n==0){
            return 0;
        }
        while(n!=0){
            int r= n%10;
            rev = rev *10+r;
            n=n/10;
        }
        return (int)rev;
    }
    public static void main(String[] args){
        int n=-321;
        int ans = reverse(n);
        System.out.println(ans);
    }
}
