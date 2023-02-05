package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class problem_no_438 {
    public List<Integer> findAnagrams(String s,String p){
        List<Integer> result= new ArrayList<>();

        int[] char_count= new int[26];
        int left=0;
        int right=0;
        int count= p.length();

        for(int i=0;i<p.length();i++){
            char c= p.charAt(i);
            char_count[c-'a']++;
        }



        while(right< s.length()){
            char c= s.charAt(right);
            if(char_count[c-'a']>=1){
                char_count[c-'a']--;
                right++;
                count--;
            }
            if(count==0){
                result.add(left);
            }

            if(right-left==p.length() && char_count[s.charAt(left++)]++ >=0){
                count++;
            }

        }


        return result;
    }
}
