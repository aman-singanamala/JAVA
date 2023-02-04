package com.company.strings;

import java.util.*;

public class group_anagrams {
    static List<List<String>> function(String[] strs) {
        // Create a hashmap to store the sorted strings as keys and the original strings as values in a list
        HashMap<String, List<String>> map = new HashMap<>();

        // Iterate through each string in the input array
        for (String str : strs) {
            // Convert the string into a char array and sort it
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            // Create a key by converting the sorted char array back into a string
            String key = new String(chars);
            // If the key does not exist in the map, create a new list for the key
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            // Add the original string to the list of the key
            map.get(key).add(str);
        }

        // Return the values of the map as a list of lists
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        List<List<String>> result = function(strs);
        System.out.println("Anagrams grouped together: ");
        for (List<String> list : result) {
            System.out.println(list);
        }
    }
}
