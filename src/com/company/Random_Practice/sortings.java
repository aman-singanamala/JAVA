package com.company.Random_Practice;

import java.util.Collections;

public class sortings {
    static void swap(int[] array, int a, int b){
        int temp= array[a];
        array[a]= array[b];
        array[b]= temp;

    }
    static void insertionsort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    swap(array, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void bubblesort(int[] array){
        for(int i=0;i< array.length-1;i++){
            for(int j=0;j< array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
    }
    static void bubble_sort_optimized(int[] array){
        int flag=0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    swap(array, j, j+1);
                    flag=1;
                }

            }
            if(flag==0){
                break;
            }
        }
    }
    static void selection_sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int last= array.length-i-1;
            int MaxIndex=getMaxIndex(array,0, last);
            swap(array, MaxIndex, last);
        }
    }
    static int getMaxIndex(int[] array, int start, int end){
        int max= start;
        for(int i=start;i<end;i++){
            if(array[max]< array[i]){
                max= i;
            }
        }
        return max;
    }
    static void quicksort(int[] array, int start, int end) {
        if(start<end){
            int partitionIndex= Partition(array,start, end);
            quicksort(array,start, partitionIndex-1);
            quicksort(array,partitionIndex+1, end);
        }

    }
    static int Partition(int[] array, int start, int end){
        int pivot= array[end-1];
        int partitionIndex= start; // set partition index as start initially
        for(int i=start;i<end;i++){
            if(array[i]<=pivot){
                int temp= array[i];
                array[i]= array[partitionIndex];
                array[partitionIndex]= temp;
                partitionIndex++;
            }
        }
        int temp= array[partitionIndex];
        array[partitionIndex]= array[end-1];
        array[end-1]=temp;

        return partitionIndex;
    }

    static void printarr(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }


    public static void main(String[] args) {
        int[] a= {5,9,7,-99,100,0,1000,1111,-1111};
//        insertionsort(a);
//        bubblesort(a);
//        bubble_sort_optimized(a);
//        selection_sort(a);
        quicksort(a,0,a.length);
        printarr(a);
    }
}
