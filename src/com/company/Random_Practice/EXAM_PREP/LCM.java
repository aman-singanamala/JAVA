package com.company.Random_Practice.EXAM_PREP;

public class LCM {
    public static int gcd_calc(int a, int b){
        int hcf= hcf(a,b);
        int ans= (a*b)/hcf;
        return ans;
    }
    public static int hcf(int a,int b){
        int res= Math.min(a,b);
        while(res>0){
            if(a%res==0 && b %res==0){
                break;
            }
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        int ans= gcd_calc(15,20);
        System.out.println(ans);
    }
}
