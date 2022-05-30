package com.company.recursion;

public class _5_factorial_of_anumber {
    public static void main(String[] args) {
        int ans=factorial(5);
        System.out.println(ans);
    }
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
