package com.company.leetcode;

import java.util.Arrays;

public class problem_no_16 {
    public static int threeSumClosest(int[] nums, int target) {
        // Initialize closestSum to the first 3 elements in the array and diff to the absolute difference between closestSum and target
        int closestSum = nums[0] + nums[1] + nums[2];
        int diff = Math.abs(closestSum - target);

        // Sort the array in ascending order
        Arrays.sort(nums);

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Set left pointer to the element after the current element
            int left = i + 1;
            // Set right pointer to the last element in the array
            int right = nums.length - 1;

            // While the left pointer is less than the right pointer
            while (left < right) {
                // Calculate the sum of the elements at the current, left, and right indices
                int sum = nums[i] + nums[left] + nums[right];
                // Calculate the absolute difference between sum and target
                int newDiff = Math.abs(sum - target);

                // If the difference between sum and target is smaller than the current diff
                if (newDiff < diff) {
                    // Update diff to the new difference and closestSum to the new sum
                    diff = newDiff;
                    closestSum = sum;
                }

                // If the sum is less than the target
                if (sum < target) {
                    // Move the left pointer to the right to try to find a larger sum
                    left++;
                } else {
                    // Otherwise, move the right pointer to the left to try to find a smaller sum
                    right--;
                }
            }
        }

        // Return the closest sum
        return closestSum;
    }
}

