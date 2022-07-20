package com.company.leetcode;

public class problem_no_1816 {
    public String truncareSentence(String s,int k){
        String[] array = s.split(" ");
        String result="";
        for (int i = 0; i < k; i++) {
            result=result+array[i];
            result=result+" ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        String s= "Hello how are you Contestant";
        problem_no_1816 ob= new problem_no_1816();
        String ans = ob.truncareSentence(s,4);
        System.out.println(ans);
    }
}
