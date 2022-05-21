package com.company.arrays_java;
// USING ANOTHER ARRAY ( NAIVE OR BASIC APPROACH
import java.nio.channels.ScatteringByteChannel;
import java.util.Arrays;
import java.util.Scanner;
public class _7_remove_element_at_given_index {
    public static int[] remove(int[] array, int index) {
        if(array==null||index<0||index>= array.length){
            return array;
        }
        int[] array_cp= new int[array.length-1];
        for(int i=0,k=0;i<array.length;i++){
            if(i==index){
                continue;
            }
            array_cp[k++]=array[i];
        }
        return array_cp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a= {7,8,9,10,11,12};
        System.out.print("Original Array is:"+ Arrays.toString(a));
        int index;
        System.out.println();
        System.out.print("Enter the index to be removed:");
        index=in.nextInt();
        a=remove(a,index);
        System.out.println("After removing Index:"+Arrays.toString(a));
    }
}