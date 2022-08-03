package com.company.leetcode;

public class problem_no_344 {
    public void reverseString(String[] s){
        int n= s.length;
        int i=0;
        int j=n-1;
        while(i<j){
            String temp= s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        for (String value : s) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        String[] a= {"h","e","l","l","o"};
        problem_no_344 ob = new problem_no_344();
        ob.reverseString(a);
    }
}
