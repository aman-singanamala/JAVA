package com.company.arrays_java;
public class _20_missing_natural_number {
    public static void find(int[] array){
        int n= array.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i< array.length;i++){
            sum=sum-array[i];
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        int[] a={1,2,3,5,6,7,8,9,10};
        find(a);
    }
}
