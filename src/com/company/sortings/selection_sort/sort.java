package com.company.sortings.selection_sort;

// Selection sort
// select an element and put it at its correct index
public class sort {
    static void selection_sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            // find the maximum item in the remaining array and swap with the correct index
            int last= array.length-i-1;
            int maxIndex= getMaxIndex(array, 0, last);
            swap(array,maxIndex, last);
        }
    }
    static int getMaxIndex(int[] array, int start, int end){
        int max= start;
        //here max, start, end are indices
        for (int i = start; i < end; i++) {
            if(array[i]>array[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] array, int i, int j){
        int temp= array[i];
        array[i]= array[j];
        array[j]= temp;
    }
    static void printarry(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int[] a= {1,-99,66,999,-100,0,5};
        selection_sort(a);
        printarry(a);
    }
}
