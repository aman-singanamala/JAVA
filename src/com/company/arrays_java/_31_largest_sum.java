package com.company.arrays_java;
public class _31_largest_sum {
    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static int algorithm(int[] array){
        int max_so_far=array[0];
        int current_max=array[0];
        for(int i=1;i< array.length;i++){
            current_max=max(array[i],current_max+array[i]);
            max_so_far=max(max_so_far,current_max);
        }
        return max_so_far;
    }
    public static void main(String[] args){
        int a[]={-2, -3, 4, -1, -2, 1, 5, -3};
        int max_sum= algorithm(a);
        System.out.println(max_sum);
    }
}