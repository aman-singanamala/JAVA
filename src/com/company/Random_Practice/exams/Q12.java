package com.company.Random_Practice.exams;
import java.util.*;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input= in.next();

        Map<Character, Integer> freq= new TreeMap<>();
        for(char c:input.toCharArray()){
            if(Character.isLetter(c)){
                if(freq.containsKey(c)){
                    freq.put(c, freq.get(c)+1);
                }else{
                    freq.put(c, 1);
                }
            }
        }
        for(Map.Entry<Character, Integer> entry: freq.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}