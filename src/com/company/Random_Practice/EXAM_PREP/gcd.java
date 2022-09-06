package com.company.Random_Practice.EXAM_PREP;

public class gcd {
    public static int gcd_calc(int a,int b){
        int result= Math.min(a,b);
        while(result>0){
            if(a%result==0 && b%result ==0){
                break;
            }
            result--;
        }
        return result;
    }
    public static void main(String[] args) {
        int a= gcd_calc(98,56);
        System.out.println(a);
    }
}
