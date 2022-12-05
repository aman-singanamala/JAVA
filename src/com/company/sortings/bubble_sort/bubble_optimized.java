package com.company.sortings.bubble_sort;

public class bubble_optimized {
     /*the time complexity of bubble sort can be optimized for best case,
     when all elements of the array are in sorted order, then there
     will be no swaps, so we can use it to identify whether our array is sorted or not
     we can use a flag variable with initial value= 0
     if in any pass, there is no swap,  just break the loop and we will get sorted elements*/

    static void sort(int[] array){
        int flag=0;
        for(int i=0;i< array.length-1;i++){
            for(int j=0;j< array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp= array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                    flag=1;
                }
            }
            if(flag==0) {
                break;
            }
        }
    }
    static void printarray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={888,-5,6,0,88,-99,99};
        sort(arr);
        printarray(arr);
    }
}

