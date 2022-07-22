package com.company.leetcode;

public class problem_no_1704 {
    public boolean  halvesAreAlike(String s){
        String half1="";
        int count1=0;
        String half2="";
        int count2=0;
        for(int i=0;i<s.length()*0.5;i++){
            half1=half1+s.charAt(i);
        }
        for (int i =(s.length()/2); i < s.length(); i++) {
            half2=half2+s.charAt(i);
        }
        for (int i = 0; i < half1.length(); i++) {
            if(isVowel(half1.charAt(i))){
                count1++;
            }
        }
        for (int i = 0; i < half2.length(); i++) {
            if(isVowel(half2.charAt(i))){
                count2++;
            }
        }
        return count1==count2;
    }
    static boolean isVowel(char k){
        return k=='a' || k=='e' || k=='i' || k=='o' || k=='u' || k=='A' || k=='E' || k=='I' || k=='O' || k=='U';
    }
    public static void main(String[] args) {
        problem_no_1704 ob = new problem_no_1704();
        boolean ans = ob.halvesAreAlike("book");
        System.out.println(ans);
    }
}
