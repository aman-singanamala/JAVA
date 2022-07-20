package com.company.leetcode;

import java.util.HashSet;

public class problem_no_1832 {
    public boolean checkIfPangram(String sentence) {
        boolean ans= true;
        HashSet<Character> s= new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            s.add(sentence.charAt(i));
        }
        if(s.size()!=26){
            ans=false;
        }
        else {
            ans=true;
        }
        return ans;
    }

    public static void main(String[] args) {
        problem_no_1832 ob = new problem_no_1832();
        boolean ans = ob.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        System.out.println(ans);
    }
}
