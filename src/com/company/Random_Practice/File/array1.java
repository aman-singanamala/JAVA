package com.company.Random_Practice.File;

import java.util.Arrays;

public class array1 {
    static int returnnum(int[] array, int n){
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            if(array[i]>=n){
                return array[i-1];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a = {11,19,13,16};
        int ans= returnnum(a, 15);
        System.out.println(ans);
    }
}
