package random;

import java.util.*;

public class a {
    public int compute(int[] array, int l, int r) {
        int sum = 0;
        int sign = 1;
        for (int i = l; i <= r; i++) {
            sum += sign * array[i];
            sign = sign * -1;
        }
        return sum;
    }

    private static int countDivisors(int x) {
        int count = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        return count + 1;
    }

    public static ArrayList<Integer> subarraysum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            for (int j = i + 1; j <= n; j++) {
                if (curr == s) {
                    result.add(i + 1);
                    result.add(j);
                    return result;
                }

                if (curr > s || j == n) {
                    break;
                }

                curr += arr[j];
            }
        }
        result.add(-1);
        return result;
    }

    public static boolean isIsomorphic(String s, String t) {
        // Check if the lengths of the two strings are different
        // If they are different, they cannot be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // Create two HashMaps to store character mappings
        // sMap: maps characters from s to corresponding characters in t
        // tMap: maps characters from t to corresponding characters in s
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        // Iterate over each character in s and t simultaneously
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i); // Current character in s
            char tChar = t.charAt(i); // Current character in t

            // Check if the current character in s already has a mapping
            if (sMap.containsKey(sChar)) {
                // If it has a mapping, check if the mapping is correct
                if (sMap.get(sChar) != tChar) {
                    // If the mapping is incorrect, s and t are not isomorphic
                    return false;
                }
            } else {
                // If the current character in s does not have a mapping, add a new mapping
                sMap.put(sChar, tChar);
            }

            // Check if the current character in t already has a mapping
            if (tMap.containsKey(tChar)) {
                // If it has a mapping, check if the mapping is correct
                if (tMap.get(tChar) != sChar) {
                    // If the mapping is incorrect, s and t are not isomorphic
                    return false;
                }
            } else {
                // If the current character in t does not have a mapping, add a new mapping
                tMap.put(tChar, sChar);
            }
        }

        // If the method has not returned false so far, it means all characters have been mapped correctly
        // Therefore, s and t are isomorphic
        return true;
    }

    public static int findMaxsubarrayones(int[] nums) {
        int maxcount = 0;
        int curr = 0;
        int start = 0;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                curr++;
                if (curr > maxcount) {
                    maxcount = curr;
                    end = i;
                }
            } else {
                curr = 0;
            }

            start = end - maxcount + 1;


        }
        return maxcount;
    }

    public static int findMaxsubbarrayones(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int maxcount = 0;
        int zeroscount = 0;
        int count = 0;
        while (j < n) {
            if (nums[j] == 1) {
                count++;
                maxcount = Math.max(maxcount, count);
            } else {
                count = 0;
                i = j + 1;
            }

            j++;

        }
        return maxcount;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int windowsum = 0;
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            windowsum += nums[j];

            while (windowsum >= target) {
                minLength = Math.min(windowsum, j - i + 1);
                windowsum -= nums[i];
                i++;
            }
            j++;
        }
        if (minLength != Integer.MAX_VALUE) {
            return minLength;
        }
        return 0;
    }

    public double sqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        double precision = 0.00001;
        double left = 1;
        double right = x;
        while (right - left > precision) {
            double mid = left + (right - left) / 2;
            double square = mid * mid;
            if (Math.abs(x - square) < precision) {
                return mid;
            } else if (square < x) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static boolean anagrams(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int[] amap = new int[a.length()];


        for (int i = 0; i < a.length(); i++) {
            amap[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            amap[b.charAt(i) - 'a']--;
        }

        for (int num : amap) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            ans.add(count);
        }
        ans.add(0);
        return ans;
    }

    private static void performOperations(int[] arr) {
        List<Integer> operations = new ArrayList<>();
        int minNonZero = Integer.MAX_VALUE;

        // Find the minimum non-zero element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] < minNonZero) {
                minNonZero = arr[i];
            }
        }

        // Perform operations until all elements are zero
        while (minNonZero != 0) {
            operations.add(minNonZero);

            // Subtract the minimum non-zero element from all non-zero elements
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[i] -= minNonZero;
                }
            }

            // Find the new minimum non-zero element
            minNonZero = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0 && arr[i] < minNonZero) {
                    minNonZero = arr[i];
                }
            }
        }

        // Print the minimum non-zero element before each operation
        for (int i = 0; i < operations.size(); i++) {
            System.out.print(operations.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(5 << 1);

    }

    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int currentArea = Math.min(height[i], height[j]) * (j - i);
                maxArea = Math.max(maxArea, currentArea);
            }
        }

        return maxArea;
    }

    public int lengthOfLongestSubString(String s) {
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        int maxlength = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxlength = Math.max(maxlength, set.size());
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlength;
    }

    public int maxProduct(String[] words){
        int maximum=1;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(!hasCommonLetters(words[i], words[j])){
                    maximum= Math.max(maximum, (words[i].length()* words[j].length()));
                }
            }
        }
        return maximum;
    }

    private boolean hasCommonLetters(String word1, String word2){
        int[] charcount= new int[26];
        for(char c : word1.toCharArray()){
            charcount[c-'a']++;
        }
        for(char c: word2.toCharArray()){
            if(charcount[c-'a']>0){
                return true;
            }
        }

        return false;
    }








}
