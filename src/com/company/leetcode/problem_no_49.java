package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class problem_no_49 {
    public static List<List<String>> groupAnagrams(String[] strs){
        // initialize a hashmap to store the anagrams
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] chars= str.toCharArray();

            Arrays.sort(chars);

            String key= new String(chars);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans= groupAnagrams(strs);
        System.out.println(ans);
    }
}
