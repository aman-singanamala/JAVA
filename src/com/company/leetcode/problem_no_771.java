package com.company.leetcode;

import java.util.HashSet;

public class problem_no_771 {
    public int numJewelsInStones(String jewels,String stones){
        int count=0;
        HashSet<Character> set = new HashSet<>();
        for(char character: jewels.toCharArray()){
            set.add(character);
        }
        for(char character: stones.toCharArray()){
            if(set.contains(character)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        problem_no_771 ob= new problem_no_771();
        int ans= ob.numJewelsInStones("aA","aAAbbb");
        System.out.println(ans);
    }
}
