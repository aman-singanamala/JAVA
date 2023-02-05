package com.company.sliding_window;

import java.util.ArrayList;

public class _1_ {
    static ArrayList<ArrayList<Integer>> subarrays_brute(int[] array, int k) {
        ArrayList<ArrayList<Integer>> subarrays = new ArrayList<>();
        for (int i = 0; i <= array.length - k; i++) {
            ArrayList<Integer> subarray = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                subarray.add(array[i + j]);
            }
            subarrays.add(subarray);
        }
        return subarrays;
    }


    static ArrayList<ArrayList<Integer>> subarrays_sliding_window(int[] array, int k) {
        // Initialize the list tp store the subarrays
        ArrayList<ArrayList<Integer>> subarrays = new ArrayList<>();

        // Initialize the list to store the current subarray of size k
        ArrayList<Integer> subarray = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            // add the current element to the subarray
            subarray.add(array[i]);

            // if the size of the subarray is k, add it to the resultnat subarray and remove the first element
            if (subarray.size() == k) {
                subarrays.add(new ArrayList<>(subarray));
                subarray.remove(0);
            }
        }
        return subarrays;
    }


    static int max_sum_subarray(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        // keep track of starting of the window
        int windowStart = 0;
        int windowEnd = 0;

        // key track of the sum of the current window
        int windowSum = 0;
        while (windowEnd < array.length) {
            windowSum = windowSum + array[windowEnd];

            if(windowEnd-windowStart+1<k){
                windowEnd++;
            } else if (windowEnd-windowStart+1==k) {
                maxSum=Math.max(maxSum, windowSum);

                windowSum= windowSum- array[windowStart];
                windowStart++;
                windowEnd++;
            }

        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 10, -11};
        int k = 3;
//        ArrayList<ArrayList<Integer>> subarrays= subarrays_brute(arr,k);
        ArrayList<ArrayList<Integer>> subarrays = subarrays_sliding_window(arr, k);
//        for(ArrayList<Integer> subarray: subarrays){
//            for(int i: subarray){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
        int maxisum= max_sum_subarray(arr,3);
        System.out.println(subarrays);
        System.out.println(maxisum);

    }


}
