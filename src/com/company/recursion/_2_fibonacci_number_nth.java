package com.company.recursion;

public class _2_fibonacci_number_nth {
    static int fibo(int n){
        // base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }
}
