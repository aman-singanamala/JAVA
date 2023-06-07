package Recursion;

import java.util.*;

public class arrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
//        System.out.println(sorted(arr, 0));
//        System.out.println(ls(arr, 48, 0));
//        ArrayList<Integer> ans = new ArrayList<>();
//        ans = findAll(arr, 1, ans, 0);
//        System.out.println(ans);
//        generatesubSets(arr);
        ArrayList<Integer> list= new ArrayList<>();
        subset(arr,0, list);



    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    // linear search
    static int ls(int[] nums, int target, int index) {
        if (index >= nums.length) {
            return -1;
        }
        if (nums[index] == target) {
            return index;
        } else {
            return ls(nums, target, index + 1);
        }
    }

    // find all indices of target (with list parameter)
    static ArrayList<Integer> findAll(int[] nums, int target, ArrayList<Integer> list, int index) {
        if (index == nums.length) {
            return list;
        }
        if (nums[index] == target) {
            list.add(index);
        }

        return findAll(nums, target, list, index + 1);
    }

    // find all indices of target (without list parameter)
    static ArrayList<Integer> findAllI(int[] nums, int target, int index) {
        // Create a new ArrayList to store the indices of the target element
        ArrayList<Integer> list = new ArrayList<>();
        // Base case: If the current index is equal to the length of the array, return the empty list
        if (index == nums.length) {
            return list;
        }
        // Check if the element at the current index is equal to the target
        if (nums[index] == target) {
            // If it is, add the index to the list
            list.add(index);
        }
        // Recursively call the findAllI function with the next index
        ArrayList<Integer> listFromBelow = findAllI(nums, target, index + 1);
        // Merge the list of indices obtained from the recursive call with the current list
        list.addAll(listFromBelow);
        // Return the final list of indices
        return list;
    }

    static int rotataedBS(int[] nums) {
        int ans = rotatedBSHelper(nums, 0, nums.length - 1);
        return ans;
    }

    static int rotatedBSHelper(int[] nums, int low, int high) {
        if (nums[low] <= nums[high]) {
            return low;
        }
        int n = nums.length;
        int mid = low + (high - low) / 2;
        int next = (mid + 1) % n;
        int prev = (mid - 1 + n) % n;
        if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
            return mid;
        }

        if (nums[mid] <= nums[high]) {
            return rotatedBSHelper(nums, low, mid - 1);
        } else if (nums[mid] >= nums[low]) {
            return rotatedBSHelper(nums, mid + 1, high);
        }

        return -1;
    }


    ////////////////////////////////////////////////////////////////////////

    static void generatesubSets(int[] nums) {
        int[] currentsubset = new int[nums.length];
        generateSubsetsRecursive(nums, 0, currentsubset, 0);
    }

    public static void generateSubsetsRecursive(int[] nums, int index, int[] currentSubset, int currentsize) {
        if (index == nums.length) {
            printsubset(currentSubset, currentsize);
            return;
        }
        currentSubset[currentsize] = nums[index];
        generateSubsetsRecursive(nums, index + 1, currentSubset, currentsize + 1);
        generateSubsetsRecursive(nums, index + 1, currentSubset, currentsize);
    }

    public static void printsubset(int[] subset, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(subset[i] + " ");
        }
        System.out.println();
    }


    //////////////////////////////////////////////////////////////////////

    // Subset
    public static void subset(int[] arr, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        list.add(arr[index]);
        subset(arr, index+1, list);
        list.remove(list.size()-1);
        subset(arr, index+1,list);
    }



}
