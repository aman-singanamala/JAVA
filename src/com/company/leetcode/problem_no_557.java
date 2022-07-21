package com.company.leetcode;

public class problem_no_557 {
    static String reverse(String s){
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            result= result+s.charAt(i);
        }
        return result;
    }
    public String reverseWords(String s){
        String result = "";
        int k=0;
        String[] array = s.split(" ");

        for(String str : array){
            result= result+ reverse(str);
            result=result+" ";
        }

        return result.trim();
    }



    public static void main(String[] args) {
        problem_no_557 ob = new problem_no_557();
        String ans = ob.reverseWords("aman singanamala");
        for(int i=0;i<ans.length();i++){
            System.out.print(ans.charAt(i));
        }
    }
}
