package com.company.GFG;

import java.util.Arrays;

public class array_fitting {
    public static boolean isFit (int arr[], int brr[], int n) {
        //Complete the function
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<n;i++){
            if(arr[i]>brr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] a = {7, 5, 3, 2};
        int[] b = {5, 4, 8, 7};
        boolean ans= isFit(a,b,a.length);
        System.out.println(ans);
    }
}
