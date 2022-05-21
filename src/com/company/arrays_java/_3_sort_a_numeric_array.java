package com.company.arrays_java;

import java.util.Arrays;

public class _3_sort_a_numeric_array {
    public static void main(String[] args) {
        int[] array_1={5,6,9,3,1,2,3,6,4,9,9,3,2,11,222,33};
        String[] array_2={"apple","ball","zebra","elephant","egg","lemon"};
        Arrays.sort(array_1);
        System.out.println( Arrays.toString(array_1));
        System.out.println();
        Arrays.sort(array_2);
        System.out.println( Arrays.toString(array_2));
    }

}
