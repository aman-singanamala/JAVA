package com.company.recursion;

public class _6_sum_of_digits {
    // N= 1234
    // sum = 1+2+3+4=10
    public static void main(String[] args) {
        int ans=print(10);
        System.out.println(ans);
    }
    static int print(int n){
        if(n<10){
            return n;
        }
        else{
            return n%10+print(n/10);
        }
    }
}
