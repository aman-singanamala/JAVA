package com.company.Random_Practice.Sortings_algorithms;

import java.util.Arrays;

public class median {

    static int[] merger(int[] A, int[] B) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[A.length + B.length];
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                res[k++] = A[i++];
            } else {
                res[k++] = B[j++];
            }
        }

        while (i < A.length) {
            res[k++] = A[i++];
        }
        while (j < B.length) {
            res[k++] = B[j++];
        }

        return res;
    }

    static int[] sort(int[] a) {
        if (a.length == 1) {
            return a;
        }

        int mid = a.length / 2;

        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);


        return merger(left, right);
    }

    static double findmedian(int[] a){
        int[] nums= sort(a);
        if(nums.length%2== 0){
            int mid = nums.length/2;

            return (double)(nums[mid-1]+ nums[mid])/2.0;
        }

        int mid= nums.length/2;

        return (double) nums[mid];
    }
    public static void main(String[] args) {
        int[] arr= {1,5,7,8,-9,8,0,99};
        double m= findmedian(arr);
        System.out.println(m);
    }
}