package com.company.leetcode;

public class problem_no_14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans= new StringBuilder();
        if(strs[0].isEmpty()){
            return "";
        }
        if(strs[0].length()==1){
            return strs[0];
        }
        int minl= strs[0].length();
        for(int i=1;i<strs.length;i++){
            minl= Math.min(minl,strs[i].length());
        }
        for(int i=0;i<minl;i++){
            char curr= strs[0].charAt(i);
            for(String str : strs){
                if(str.charAt(i)!=curr){
                    return ans.toString();
                }
            }
            ans.append(curr);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        problem_no_14 ob = new problem_no_14();
        String[] a = {"flower","flow","flight"};
        String ans= ob.longestCommonPrefix(a);
        System.out.println(ans);
    }
}
