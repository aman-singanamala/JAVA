package com.company.sortings.insertion_sort;
public class sort {
    static void sort(int[] array){
         for(int i=0;i< array.length-1;i++){
             for(int j=i+1;j>0;j--){
                 if(array[j]<array[j-1]){
                    swap(array,j, j-1);
                 }else{
                     break;
                 }
             }
         }
    }
    static void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a= {5,4,7,9,6,3,2,1};
        sort(a);
        printarray(a);
    }
}
