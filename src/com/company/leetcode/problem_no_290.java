package com.company.leetcode;

import java.util.HashMap;

public class problem_no_290 {
    public boolean wordPattern(String pattern, String s){
        String[] s_array= s.split(" ");
        if(pattern.length()!=s_array.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char current_char= pattern.charAt(i);
            if(map.containsKey(current_char)){
                if(!map.get(current_char).equals(s_array[i])){
                    return false;
                }
            }else{
                if(map.containsValue(s_array[i])){
                    return false;
                }
                map.put(current_char,s_array[i]);
            }
        }
        return true;
    }
}
