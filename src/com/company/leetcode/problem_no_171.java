package com.company.leetcode;

public class problem_no_171 {
    public int titleToNumber(String columnTitle) {
        int result=0;
        for(int i=0;i<columnTitle.length();i++){
            result= result*26;
            result= result+ columnTitle.charAt(i)-'A'+1;

        }
        return result;
    }
    public static void main(String[] args){
        problem_no_171 ob = new problem_no_171();
        int ans =ob.titleToNumber("CDA");
        System.out.println(ans);
    }
}
