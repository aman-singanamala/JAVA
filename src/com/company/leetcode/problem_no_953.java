package com.company.leetcode;

public class problem_no_953 {
    static int[] mapping = new int[26];

    public boolean isAlienSorted(String[] words, String order) {
// Create an array to store the index of each character in the order string
        int[] index = new int[26];
        for (int i = 0; i < order.length(); i++) {
            // Store the index of the character in the order string
            index[order.charAt(i) - 'a'] = i;
        }

        // Iterate through the words array, comparing each pair of adjacent words


        for (int i = 1; i < words.length; i++) {
            String word1 = words[i - 1];
            String word2 = words[i];

            // Find the length of the shorter word
            int length = Math.min(word1.length(), word2.length());
            for (int j = 0; j < length; j++) {
                // Compare the characters at the same position in both words
                if (word1.charAt(j) != word2.charAt(j)) {
                    // If the character in word1 has a higher index in the order string,
                    // it comes after the character in word2 and the words are not sorted
                    if (index[word1.charAt(j) - 'a'] > index[word2.charAt(j) - 'a']) {
                        return false;
                    }
                    // If the characters are different, we can stop comparing
                    break;
                }
            }

            // If word1 is longer than word2 and starts with word2, it comes after word2
            // and the words are not sorted
            if (word1.length() > word2.length() && word1.startsWith(word2)) {
                return false;
            }
        }
        // If all comparisons pass, the words are sorted according to the alien dictionary
        return true;
    }


}
