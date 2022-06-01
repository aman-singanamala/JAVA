package com.company.arrays_java;

public class _32_rotation_of_array {
    static void rotate(int[] array){
        int i=0;
        int j= array.length-1;
        while(i!=j){
            int temp= array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        rotate(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

// 1 2 3 4 5
// 5 2 3 4 1
// 5 1 3 4 2
// 5 1 2 3 4
// 5 1 2 3 4
