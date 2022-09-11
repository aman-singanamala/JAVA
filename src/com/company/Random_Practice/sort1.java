package com.company.Random_Practice;

import java.util.Arrays;

public class sort1 {
    public static void main(String[] args){
        int[] a= {1,6,9,3,-4,8,99,-110};
        int[] ans= mergesort(a);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergesort(int[] a){
        if(a.length==1){
            return a;
        }
        int mid= a.length/2;
        int[] left=mergesort(Arrays.copyOfRange(a,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(a,mid,a.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right){
        int i=0;
        int j=0;
        int k=0;
        int[] ans= new int[left.length+right.length];
        while(i< left.length && j < right.length){
            if(left[i]<=right[j]){
                ans[k]= left[i];
                k++;
                i++;
            }
            else{
                ans[k]= right[j];
                k++;
                j++;
            }
        }
        while(i<left.length){
            ans[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            ans[k]=right[j];
            k++;
            j++;
        }
        return ans;
    }
}
