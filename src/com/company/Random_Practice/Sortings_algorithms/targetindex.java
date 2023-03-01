package com.company.Random_Practice.Sortings_algorithms;

public class targetindex {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 5, 1, 7, 6, 3};
        int target = 5;
        int index = binarySearchUsingMergeSort(arr, target);
        if (index != -1) {
            System.out.println("The index of " + target + " is " + index);
        } else {
            System.out.println(target + " is not found in the array.");
        }
    }


    public static int binarySearchUsingMergeSort(int[] arr, int target) {
        int result = mergeSortWithIndex(arr, target, 0, arr.length - 1);
        return result;
    }

    private static int mergeSortWithIndex(int[] arr, int target, int start, int end) {
        if (start >= end) {
            if (arr[start] == target) {
                return start;
            } else {
                return -1;
            }
        } else {
            int mid = (start + end) / 2;
            int leftResult = mergeSortWithIndex(arr, target, start, mid);
            if (leftResult != -1) {
                return leftResult;
            }
            int rightResult = mergeSortWithIndex(arr, target, mid + 1, end);
            if (rightResult != -1) {
                return rightResult;
            }
            return -1;
        }
    }
}