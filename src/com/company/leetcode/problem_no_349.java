package com.company.leetcode;

import com.sun.jdi.IntegerType;

import java.util.Arrays;
import java.util.HashSet;

public class problem_no_349 {
    public int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        for(int i=0;i< nums1.length;i++){
            set1.add(nums1[i]);
        }
        for (int j : nums2) {
            if (set1.contains(j)) {
                set2.add(j);
            }
        }
        int[] array= new int[set2.size()];
        int j=0;
        for(int i : set2){
            array[j++]=i;
        }
        return array;
    }

    public static void main(String[] args) {
        problem_no_349 ob = new problem_no_349();
        int[] a= {1,2,3,4,5};
        int[] b= {1,2,3};
        int[] ans= ob.intersection(a,b);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
