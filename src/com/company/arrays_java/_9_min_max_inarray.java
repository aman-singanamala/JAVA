package com.company.arrays_java;
public class _9_min_max_inarray {
    public static void minmax(int[] array){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Maximum Element in the Array is:"+max);
        System.out.print("Minimum Element in the Array is:"+min);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,6,3,9,5,2,3,6,55,222,-1};
        minmax(arr);
    }
}