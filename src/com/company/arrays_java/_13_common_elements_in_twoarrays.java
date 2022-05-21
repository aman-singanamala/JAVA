package com.company.arrays_java;

public class _13_common_elements_in_twoarrays {
    public static void common(int[] array1,int[] array2){
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a= {1, 2, 5, 5, 8, 9, 7, 10};
        int[] b= {1, 0, 6, 15, 6, 4, 7, 0};
        System.out.println("Common Elements in both arrays are:");
        common(a,b);
    }
}
