package com.company.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class problem_no_202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
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
    static int func(int num){
        int res=0;
        while(num>0){
            res= (int) (res+(Math.pow(num%10,2)));
            num=num/10;
        }
        return res;
    }

    public static void main(String[] args) {
        problem_no_202 ob = new problem_no_202();
        boolean ans= ob.isHappy(19);
        System.out.println(ans);
    }
}