package com.company.arrays_java;
public class _29_move_numbers {
    public static void move(int[] array) {
        int[] newarray= new int[array.length];
        int j=0;
        //Store the negative elements
        for (int k : array) {
            if (k >= 0) {
                newarray[j++] = k;
            }
        }
        // If array contains all positive or all negative
        if(j== array.length||j==0){
            return;
        }
        for (int k : array) {
            if (k < 0) {
                newarray[j++] = k;
            }
        }
        for(int i=0;i< array.length;i++){
            System.out.print(newarray[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a= {1, -1, -3, -2, 7, 5, 11, 6};
        move(a);
    }
}
