package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class problem_no_290 {
    public boolean wordPattern(String pattern, String s){
//        String[] s_array= s.split(" ");
//        if(pattern.length()!=s_array.length){
//            return false;
//        }
//        HashMap<Character,String> map = new HashMap<>();
//        for(int i=0;i<pattern.length();i++){
//            char current_char= pattern.charAt(i);
//            if(map.containsKey(current_char)){
//                if(!map.get(current_char).equals(s_array[i])){
//                    return false;
//                }
//            }else{
//                if(map.containsValue(s_array[i])){
//                    return false;
//                }
//                map.put(current_char,s_array[i]);
//            }
//        }
//        return true;

        String[] words= s.split(" ");
        if(words.length!= pattern.length()){
            return false;
        }
        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c= pattern.charAt(i);
            // check if the current character has already been mapped to a word
            if(map.containsKey(c)){
                //if so, check if tyhe current word is the same as the one previousl mapped to this character
                if(!map.get(c).equals(words[i])){
                    return false;
                }
                // if not , add a mapping from the character to the word to the map
                map.put(c, words[i]);
            }
        }
        return true;
    }
}
