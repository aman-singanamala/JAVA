package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class problem_no_540 {
    static int usingxor(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

    static int usinglinearsearch(int[] nums) {
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        // if the single element is present at last
        return nums[nums.length - 1];
    }


    static int usinghashmap(int nums[]){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1; // or throw an exception, if no single element is found
    }

    // www.youtube.com/watch?v=nMGL2vlyJk0
    static int usingbinarysearch(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        if (nums.length == 1) {
            return nums[0];
        }
        // check if first element is the single element
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        //check if last element is the single element
        if (nums[high] != nums[high - 1]) {
            return nums[high];
        }


        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            } else if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low= mid+1;
            }else{
                high=mid-1;
            }

        }
        return nums[low];

    }
}
