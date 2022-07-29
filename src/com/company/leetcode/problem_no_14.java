package com.company.leetcode;

public class problem_no_14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans= new StringBuilder();
        if(strs[0].isEmpty()){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        int minLength= strs[0].length();
        for (int i = 1; i < strs.length ; i++) {
            minLength=Math.min(minLength,strs[i].length());
        }
        for(int i=0;i<minLength;i++){
            char current=strs[0].charAt(i);
            for (String str : strs){
                if(str.charAt(i)!= current){
                    return ans.toString();
                }
            }
            ans.append(current);
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
