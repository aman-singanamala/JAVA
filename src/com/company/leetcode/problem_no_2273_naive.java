package com.company.leetcode;
import java.util.*;
public class problem_no_2273_naive {
    public List<String> removeAnagrams(String[] words){
         ArrayList<String> list = new ArrayList<>();

         for(int i=0;i< words.length;i++) {
             int j=i+1;
             while(j< words.length && anagrams(words[i],words[j])){
                 ++j;
                 list.add(words[i]);
                 i=j;
             }
         }
         return list;
    }
    public boolean anagrams(String a1,String a2){
        if(a1.length()!=a2.length()){
            return false;
        }
        char[] str1= a1.toCharArray();
        char[] str2= a2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i=0;i<str1.length;i++){
            if(str1[i]!=str2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words ={"abba","baba","bbaa","cd","cd"};
    }
}
