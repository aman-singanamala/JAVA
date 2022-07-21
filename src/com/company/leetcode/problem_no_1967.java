package com.company.leetcode;

public class problem_no_1967 {
    public int numofStrings(String[] patterns,String word){
        int count=0;
        for(String str : patterns){
            if(word.indexOf(str)>=0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        problem_no_1967 ob = new problem_no_1967();
        String[] a= {"a","abc","bc","d"};
        int ans = ob.numofStrings(a,"abc");
        System.out.println(ans);
    }
}
