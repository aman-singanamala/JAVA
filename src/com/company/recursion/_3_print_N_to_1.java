package com.company.recursion;

public class _3_print_N_to_1 {
    public static void main(String[] args) {
        print(10);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
