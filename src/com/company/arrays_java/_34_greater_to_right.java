package com.company.arrays_java;

public class _34_greater_to_right {
    public static void main(String[] args){
        int[] array= {2, 7, 3, 5, 4, 6, 8};
        for (int i=0;i<array.length;i++){
            int j;
            for(j=i+1;j< array.length;j++){
                if(array[i]<=array[j]){
                    break;
                }
            }
            if(j== array.length){
                System.out.print(array[i]+" ");
            }
        }
    }
}
