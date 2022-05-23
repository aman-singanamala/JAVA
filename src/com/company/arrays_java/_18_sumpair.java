package com.company.arrays_java;

public class _18_sumpair {
    public static void pairs(int[] array,int sum) {
        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j< array.length;j++){
                if((i!=j)&& (array[i]+array[j]==sum)){
                    System.out.println(array[i]+" and "+array[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a= {2, 7, 4, -5, 11, 5, 20};
        pairs(a,15);
    }
}
