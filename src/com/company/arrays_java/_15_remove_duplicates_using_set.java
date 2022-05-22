package com.company.arrays_java;

import java.util.LinkedHashSet;

public class _15_remove_duplicates_using_set {
    public static void remove(int[] array){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<array.length;i++){
            set.add(array[i]);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        int[] array={1,1,23,23,2,2,3,3,40};
        remove(array);
    }
}
