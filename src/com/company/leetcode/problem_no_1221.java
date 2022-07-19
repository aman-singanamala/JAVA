package com.company.leetcode;

import java.util.Scanner;

public class problem_no_1221 {
    public int balancedStringSplit(String s){
        int r=0,c=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                r++;
            }
            else{
                c++;
            }
            if(r==c){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        problem_no_1221 ob = new problem_no_1221();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a String:");
        String a= sc.next();
        int ans= ob.balancedStringSplit(a);
        System.out.println(ans);


    }
}

