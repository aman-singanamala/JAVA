package com.company.Random_Practice.exams;

import java.util.Scanner;

public class Q18 {
    static boolean check_palindrome(String input){
        char[] arr= input.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]!=arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input= in.next();
        boolean ans = check_palindrome(input);
        System.out.println(ans);
    }

}