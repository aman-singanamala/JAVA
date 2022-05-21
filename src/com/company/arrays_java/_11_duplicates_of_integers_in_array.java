package com.company.arrays_java;
public class _11_duplicates_of_integers_in_array {
    public static void duplicates(int[] array){
        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]==array[j] && (i!=j)){
                    System.out.println(array[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,1,8,9,63,6,63,9,8};
        System.out.println("Duplicates in the array are:");
        duplicates(arr);
    }
}
