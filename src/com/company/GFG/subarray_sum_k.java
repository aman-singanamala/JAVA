package com.company.GFG;

import java.util.ArrayList;

public class subarray_sum_k {
    static ArrayList<Integer> function(int[] array, int n, int s) {

        int curr_sum = array[0];
        int start = 0, end = 0;
        while (end < n) {
            if (curr_sum == s) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(start + 1);
                list.add(end + 1);
                return list;
            } else if (curr_sum < s && end < array.length - 1) {
                end++;
                curr_sum = curr_sum + array[end];
            } else {
                curr_sum = curr_sum - array[start];
                start++;
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> ans = function(array, array.length, 15);
        System.out.println(ans);

    }
}
