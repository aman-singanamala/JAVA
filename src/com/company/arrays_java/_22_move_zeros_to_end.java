package com.company.arrays_java;

public class _22_move_zeros_to_end {
    public static void move(int[] array){
        int count=0;
        for(int i=0;i< array.length;i++){
            if(array[i]!=0){
                array[count++]=array[i];
            }
        }
        while(count< array.length){
            array[count++]=0;
        }

    }
    public static void main(String[] args) {
        int[] a={1,8,9,4,0,0,2,6,7,0,3,6,0,99,0,3};
        move(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
