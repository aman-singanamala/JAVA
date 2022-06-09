package com.company.leetcode;

public class problem_no_509 {
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        problem_no_509 ob= new problem_no_509();
        int ans= ob.fib(10);
        System.out.println(ans);
    }
}
