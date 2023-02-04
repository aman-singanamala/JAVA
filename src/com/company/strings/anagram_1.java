package com.company.strings;

import java.util.HashMap;
import java.util.Scanner;

public class anagram_1 {
    static boolean anagram_compare(String s, String t) {
        // Create a HashMap to store the frequency of each character in the first string
        HashMap<Character, Integer> map = new HashMap<>();
// Loop through each character in the first string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Check if the character is already present in the map
            if (!map.containsKey(c)) {
                // If not, add the character to the map and set its frequency to 1
                map.put(c, 1);
            }
            // If the character is already present in the map, increment its frequency
            else {
                map.put(c, map.get(c) + 1);
            }
        }
// Loop through each character in the second string
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            // Check if the character is present in the map
            if (!map.containsKey(c)) {
                // If not, return false since it cannot be an anagram if we have different words
                return false;
            }
            int count = map.get(c);
            // Decrement the frequency of the character in the map
            if (count == 1) {
                map.remove(c);
            } else {
                map.put(c, count - 1);
            }
        }

// Return true if the map is empty, indicating that both strings are anagrams of each other
        return map.isEmpty();


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s = sc.nextLine();
        System.out.println("Enter the second string: ");
        String t = sc.nextLine();
        boolean result = anagram_compare(s, t);
        if (result) {
            System.out.println("The strings are anagrams of each other");
        } else {
            System.out.println("The strings are not anagrams of each other");
        }
    }
}
