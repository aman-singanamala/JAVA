package com.company.arrays_java;
import java.util.HashSet;
public class _30_union_of_arrays {
    public static void union(int[] array1,int[] array2){
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<array1.length;i++){
            set.add(array1[i]);
        }
        for(int i=0;i< array2.length;i++){
            set.add(array2[i]);
        }
        System.out.println(set.toString());
    }
    public static void intersection(int[] array1,int[] array2){
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        for (int j : array1) {
            set1.add(j);
        }
        for (int j : array2) {
            if (set1.contains(j)) {
                set2.add(j);
            }
        }
        System.out.println(set2.toString());
    }
    public static void main(String[] args) {
        int[] a= {1, 2, 5, 6, 2, 3, 5, 7, 3 ,6,9,2};
        int[] b= {2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
        System.out.print("Union of the Arrays is : ");
        union(a,b);
        System.out.print("Intersection of the Arrays is : ");
        intersection(a,b);
    }
}
