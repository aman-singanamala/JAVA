package com.company.recursion;

public class _8_reverse_a_number {
    public static void main(String[] args) {
        reverse1(1234);
        System.out.println(sum);
    }
    static int sum=0;
    static void reverse1(int n){

        if(n<10){
            System.out.println(n);
            return;
        }
        else{
            int rem=n%10;
            sum=sum*10+rem;
            reverse1(n/10);
        }
    }
}
