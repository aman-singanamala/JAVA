package SLIDING_WINDOW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class sw_practice_variable {
    static boolean subarrayWithZeroSum(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0 || set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }

        return false;
    }

    // brute
    public static int longestSubarryWithSumK(int[] nums, int k) {
        int maxlength = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    maxlength = Math.max(maxlength, j - i + 1);
                }
            }
        }
        return maxlength;
    }

    //better

    public static int longestSubarryWithSumKoPT(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int sum = 0;
        int maxlength = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum == k) {
                maxlength = Math.max(maxlength, i + 1);
            }

            int remaining = sum - k;
            if (map.containsKey(remaining)) {
                int len = i - map.get(remaining);
                maxlength = Math.max(len, maxlength);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxlength;
    }

    public static int longSubarrWthSumDivByK(int[] arr, int k) {
        int maxlength = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum % k == 0) {
                    maxlength = Math.max(maxlength, j - i + 1);
                }
            }
        }
        return maxlength;

    }

    public static int longSubarrWthSumDivByKOPTIMAL(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int sum = 0;
        int maxlength = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum % k == 0) {
                maxlength = Math.max(maxlength, i + 1);
            }

            int remaining = sum - k;
            if (map.containsKey(remaining)) {
                int len = i - map.get(remaining);
                maxlength = Math.max(len, maxlength);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxlength;
    }


    public static int longestUniqueSubsttrbrute(String s){
        int maxlength=0;
        for(int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                if(isAllUnique(s, i, j)){
                    maxlength= Math.max(j-i, maxlength);
                }
            }
        }
        return maxlength;
    }

    public static boolean isAllUnique(String s, int start, int end){
        HashSet<Character> set = new HashSet<>();
        for(int i= start;i<end;i++){
            char ch= s.charAt(i);
            set.add(ch);
            if(set.contains(ch)){
                return false;
            }
        }
        return true;
    }

    public static int longestUniqueSubsttroptimal(String s) {
        int start = 0;
        int end = 0;
        int n = s.length();
        int maxlength = 0;
        Set<Character> set = new HashSet<>();
        while (end < n) {
            char ch = s.charAt(end);
            if (!set.contains(ch)) {
                set.add(ch);
                maxlength = Math.max(maxlength, end - start + 1);
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;

            }
        }
        return maxlength;
    }

}
