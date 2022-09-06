package com.company.Random_Practice.EXAM_PREP;

public class armstrong {
    public static boolean check(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int r= n%10;
            sum= sum+ (r*r*r);
            n=n/10;
        }
        if(sum!=temp){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ans= check(153);
        if(ans== true){
            System.out.println("Number is an Armstring number");
        }
        else{
            System.out.println("Number is not an Armstrong number");
        }
    }
}
