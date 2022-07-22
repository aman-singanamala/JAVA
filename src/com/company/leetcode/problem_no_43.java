package com.company.leetcode;

import java.math.BigInteger;
import java.math.*;
public class problem_no_43 {
    public String multiply(String num1,String num2){
        BigInteger n1= new BigInteger(num1);
        BigInteger n2= new BigInteger(num2);
        BigInteger mul = n1.multiply(n2);
        String ans= String.valueOf(mul);
        return ans;
    }

    public static void main(String[] args) {
        problem_no_43 ob = new problem_no_43();
        String ans= ob.multiply("10","15");
        System.out.println(ans);
    }
}
