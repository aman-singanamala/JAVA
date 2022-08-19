package com.company.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class problem_no_2351 {
    public char repeatedCharacter(String s){
        HashSet<Character> set = new HashSet<>();
        char ch ;
        for (int i = 0; i < s.length(); i++) {
            ch= s.charAt(i);
            if(set.contains(ch)){
                return ch;
            }
            else{
                set.add(ch);
            }
        }
        return 'x';
    }
}
