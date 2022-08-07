package com.company.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class problem_no_202 {
    public boolean isHappy(int n){
        HashSet<Integer> set= new HashSet<>();
        while(true){
            n= func(n);
            if(n==1){
                return true;
            } else if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
    }
    static int func(int n){
        int result=0;
        while(n!=0){
            result= (int) (result+Math.pow(n%10,2));
            n=n/10;
        }
        return result;
    }

    public static void main(String[] args) {
        problem_no_202 ob = new problem_no_202();
        boolean ans= ob.isHappy(19);
        System.out.println(ans);
    }
}