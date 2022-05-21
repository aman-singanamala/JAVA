package com.company.arrays_java;

public class _10_reverse_array {
    public static void reverse(int[] Array){
        for(int i=Array.length-1;i>=0;i--){
            System.out.print(Array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,6,5,9,8,7,4,3,1,2,22,111};
        reverse(arr);
    }
}
