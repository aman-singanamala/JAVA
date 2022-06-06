package com.company.leetcode;

import java.util.Arrays;

public class median_of_sorted_arrays_no_4 {
    public static double findMedianArrays(int[] nums1,int[] nums2){
        int m= nums1.length;
        int n= nums2.length;
        int[] array= new int[m+n];
        int k=0;
        int i=0;
        for(i=0;i<m;i++){
            array[k++]=nums1[i];
        }
        for(i=0;i<n;i++){
            array[k++]=nums2[i];
        }
        Arrays.sort(array);
        int l=(array.length)/2;
        double x;

        if(array.length%2==0){
            x=((array[l]+array[l-1])/2.0);
        }
        else{
            x=(array[l]);
        }
        return x;

    }

    public static void main(String[] args) {
        int[] a={1,2};
        int[] b= {3,4};
        double ans=findMedianArrays(a,b);
        System.out.println(ans);

    }

}
