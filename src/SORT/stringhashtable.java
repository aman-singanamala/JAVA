package SORT;

import java.util.*;

public class stringhashtable {


    //438. Find All Anagrams in a String
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) {
            return ans;
        }

        int k = p.length();
        int n = s.length();
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> pmap = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char ch = s.charAt(i);
            if (smap.containsKey(ch)) {
                smap.put(ch, smap.get(ch) + 1);
            } else {
                smap.put(ch, 1);
            }
        }
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            if (pmap.containsKey(ch)) {
                pmap.put(ch, pmap.get(ch) + 1);
            } else {
                pmap.put(ch, 1);
            }
        }
        if (smap.equals(pmap)) {
            ans.add(0);
        }
        for (int i = k; i < n; i++) {
            char left = s.charAt(i - k);
            char right = s.charAt(i);


            if (smap.get(left) == 1) {
                smap.remove(left);
            } else {
                smap.put(left, smap.get(left) - 1);
            }


            if (smap.containsKey(right)) {
                smap.put(right, smap.get(right) + 1);
            } else {
                smap.put(right, 1);
            }



            if (smap.equals(pmap)) {
                ans.add(i - k + 1);
            }
        }
        return ans;
    }


    // To check if two strings are anagrams or not
    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int[] count = new int[26];

        for (char c : a.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : b.toCharArray()) {
            count[c - 'a']--;
        }

        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }


    // 49. Group Anagrams
    // Brute Force solution
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> ans= new ArrayList<>();
        boolean[] visited= new boolean[strs.length];

        for(int i=0;i<strs.length;i++){
            if(!visited[i]){
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                visited[i]=true;
                for(int j=i+1;j< strs.length;j++){
                    if(!visited[j] && isAnagram(strs[i], strs[j])){
                        group.add(strs[j]);
                        visited[j]=true;
                    }
                }
                ans.add(group);
            }

        }
        return ans;
    }





}
