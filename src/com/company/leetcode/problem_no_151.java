package com.company.leetcode;

public class problem_no_151 {
    public String reverseWords(String s){
        s.trim();
        StringBuilder res= new StringBuilder();
        String[] array= s.split(" ");
        for (int i = array.length-1 ;i >= 0; i--) {
            if(array[i].length()>0){
                res.append(array[i]);
                if(i>0){
                    res.append(' ');
                }
            }
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        problem_no_151 ob = new problem_no_151();
        String ans = ob.reverseWords("hey aman singanamala");
        System.out.println(ans);
    }
}
