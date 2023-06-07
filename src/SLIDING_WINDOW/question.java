package SLIDING_WINDOW;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class slidingwindow {
    // Problem 1: Find Maximum Subarray Sum
    public static int findMaximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int currentsum = 0;
            for (int j = i; j < i + k; j++) {
                currentsum = currentsum + nums[j];
            }
            maxSum = Math.max(currentsum, maxSum);
        }
        return maxSum;
    }

    // Problem 2: Find Maximum Subarray Sum
    public static int findMaxSubarraySum(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum = windowSum + nums[i];
        }

        maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    // Problem 3: Find First Negative Number in Every Window of Size K
    public static List<Integer> FirstNegativeNumber(int[] nums, int k) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= n - k; i++) {
            int count = 0;
            for (int j = i; j < i + k; j++) {
                if (nums[j] < 0) {
                    result.add(nums[j]);
                    break;
                }
                count++;
            }

            if (count == k) {
                result.add(0);
            }
        }
        return result;
    }

    // Problem 4: Find First Negative Number in Every Window of Size K
    public static List<Integer> FirstNegative_Number(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int n = arr.length;
        List<Integer> tempList = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();

        while (j < n) {
            if (arr[j] < 0) {
                tempList.add(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (tempList.isEmpty()) {
                    finalList.add(0);
                } else {
                    finalList.add(tempList.get(0));
                    if (arr[i] < 0) {
                        tempList.remove(0);
                    }
                }
                j++;
                i++;
            }
        }
        return finalList;
    }

    // Problem 5: Check if Two Strings are Anagrams
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }

    // Problem 6: Count Occurrences of Anagrams
    public static int countAnagrams(String input, String target) {
        int count = 0;

        int k = target.length();
        int n = input.length();
        for (int i = 0; i <= n - k; i++) {
            String substring = input.substring(i, i + k);
            if (isAnagram(substring, target)) {
                count++;
            }
        }
        return count;
    }

    // Helper method: Check if all elements in the array are zero
    public static boolean allZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // Problem 7: Count Occurrences of Anagrams
    public static int countanagrams(String text, String pattern) {
        int n = text.length();
        int k = pattern.length();
        int[] map = new int[26];
        for (int i = 0; i < pattern.length(); i++) {
            map[pattern.charAt(i) - 'a']++;
        }

        int i = 0, j = 0, result = 0;
        while (j < n) {
            map[text.charAt(j) - 'a']--;
            if (j - i + 1 == k) {
                // if the window size is pattern size, check the map
                // if it contains all zeros or not
                if (allZero(map)) {
                    result++;
                }
                map[text.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        return result;
    }


    // Largest Subarray of sum K (not passing all test cases)
    public static int findLargestSubarray(int[] array, int target) {
        int maxLength = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                }
                if (sum == target) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }


//    public static int[] maxSubArray(int[] arr, int k){
//        int n= arr.length;
//        int[] result= new int[n];
//        int z=0;
//        Deque<Integer> queue= new ArrayDeque<>();
//
//        for(int i)
//    }



}

public class question {
    public static void main(String[] args) {
        slidingwindow obj = new slidingwindow();
    }
}
