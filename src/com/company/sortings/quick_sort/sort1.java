package com.company.sortings.quick_sort;

public class sort1 {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        quick_sort(arr, 0, arr.length-1);
        printarray(arr);
    }
    static void printarray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
    static void quick_sort(int[] array, int low , int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e= high;
        int m= s+(e-s)/2;
        int pivot= array[m];
        while(s<=e){
            // if its already sorted it will not swap
            while(array[s]<pivot){
                s++;
            }
            while(array[e]> pivot){
                e--;
            }
            if(s<=e){
                int temp= array[s];
                array[s]= array[e];
                array[e]= temp;
                s++;
                e--;
            }
        }
        //now pivot is at correct index, now we need to sort the remaining two sub arrays of the main array
        quick_sort(array, low, e);
        quick_sort(array, s, high);
    }
}
