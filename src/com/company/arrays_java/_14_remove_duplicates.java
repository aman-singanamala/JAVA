package com.company.arrays_java;

public class _14_remove_duplicates {
    public static int remove(int[] array,int n){
        if(n==0||n==1){
            return n;
        }
        int[] temp= new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(array[i]!=array[i+1]){
                temp[j++]=array[i];
            }
        }
        temp[j++]=array[n-1];
        for(int i=0;i<j;i++){
            array[i]=temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] a= {1,1,23,23,2,2,3,3,40};
        int n=remove(a,a.length);
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
}
