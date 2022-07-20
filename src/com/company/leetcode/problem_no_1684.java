package com.company.leetcode;

import java.util.HashSet;

public class problem_no_1684 {
    public int countConsistentStrings(String allowed, String[] words) {

        int count=0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        for(String str : words){
            boolean flag = true;
            for(int i=0;i<str.length();i++){
                if(!set.contains(str.charAt(i))){
                    flag=false;
                }
            }
            if (flag){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        problem_no_1684 ob= new problem_no_1684();
        String[] a= {"ad","bd","aaab","baa","badab"};
        int ans= ob.countConsistentStrings("ab",a);
        System.out.println(ans);
    }
}
