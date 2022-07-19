package com.company.arrays_java;


public class _6_binary_search {
    public static int search(int[] array,int k)
    {
        int start= 0;
        int end= array.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(k==array[mid]){
                return mid;
            }
            if(array[mid]<k){
                start=mid+1;
            }
            if(array[mid]>k){
                end=mid-1;
            }
        }
        return  -1;
    }

}