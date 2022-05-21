package com.company.arrays_java;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class _8_insert_at_given_position {
    public static int[] insert(int[] array,int x,int pos){
        int[] newarray= new int[array.length+1];
        for(int i=0;i< array.length+1;i++){
            if(i<pos-1){
                newarray[i]=array[i];
            }
            else if(i==pos-1){
                newarray[i]=x;
            }
            else
                newarray[i]=array[i-1];

        }
        return newarray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr ={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Original Array is : "+Arrays.toString(arr));
        System.out.println("Enter the position:");
        int position;
        position=in.nextInt();
        System.out.println("Enter the Element to be inserted:");
        int element;
        element=in.nextInt();
        arr=insert(arr,element,position);
        System.out.println("Array after insertion is :"+ Arrays.toString(arr));
    }
}
