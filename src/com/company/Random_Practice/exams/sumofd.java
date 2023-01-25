package com.company.Random_Practice.exams;

import java.util.Scanner;
import java.util.*;
public class sumofd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Input the number
        int n = sc.nextInt();
        int sum = 0;
        // Input the set of digits to be considered
        int[] digits = new int[sc.nextInt()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = sc.nextInt();
        }

        while(n>0){
            int digit= n%10;
            if(contains(digits, digit)){
                sum=sum+digit;
            }
            n=n/10;
        }

        System.out.println(sum);

    }

    public static boolean contains(int[] arr, int val){
        for (int j : arr) {
            if (j == val) {
                return true;
            }
        }
        return false;
    }

}
