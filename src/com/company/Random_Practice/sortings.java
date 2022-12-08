package com.company.Random_Practice;

public class sortings {
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
    static void swap(int[] array, int a, int b){
        int temp= array[a];
        array[a]= array[b];
        array[b]= temp;

    }
    static void printarr(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }


    public static void main(String[] args) {
        int[] a= {5,9,7,-99,100,0,1000,1111,-1111};
//        insertionsort(a);
//        bubblesort(a);
        bubble_sort_optimized(a);
        printarr(a);
    }
}
