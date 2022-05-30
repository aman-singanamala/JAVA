package com.company.recursion;

public class _4_print_1_to_N {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
