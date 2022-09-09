package com.company.Random_Practice;
import java.util.Arrays;

public class merge_two_arrays {
    static int[] merge(int[] arr1,int[] arr2){
        int i=0;// for traversing arr1
        int j=0;// for traversing arr2
        int k=0; // for adding elements into merged array
        int[] merged= new int[arr1.length+arr2.length];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i< arr1.length && j< arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
                k++;
            } else{
                merged[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            merged[k]= arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            merged[k]= arr2[j];
            j++;
            k++;
        }
        return merged;
    }
    public static void main(String[] args){
        int[] a= {10,5,15,-1};
        int[] b= {20,3,2,12};
        int[] ans= merge(a,b);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
