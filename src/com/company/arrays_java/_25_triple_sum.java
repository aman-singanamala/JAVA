package com.company.arrays_java;

import java.util.ArrayList;
import java.util.List;

public class _25_triple_sum {
    static void triplepair(int[] array, int sum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < array.length-2; i++) {
            for (int j = i+1; j < array.length-1; j++) {
                for (int k = j+1; k < array.length; k++) {
                    if (i != j && j != k && array[i] + array[j] + array[k] == sum) {
                        List<Integer> inner_list = new ArrayList<Integer>();
                        inner_list.add(array[i]);
                        inner_list.add(array[j]);
                        inner_list.add(array[k]);
                        list.add(inner_list);
                    }
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] a={1,-2,0,5,-1,-4};
        triplepair(a,2);

    }
}

