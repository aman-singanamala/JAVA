package com.company.arrays_java;

public class _28_sort_0s_1s_2s {
    public static void function(int[] array){
        int zeros=0;
        int ones=0;
        int twos=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                zeros++;
            }
            else if(array[i]==1){
                ones++;
            }
            else if(array[i]==2){
                twos++;
            }
        }
        int[] a= new int[array.length];
        for(int i=0;i<ones;i++){
            a[i]=0;
        }
        for(int i=zeros;i<zeros+ones;i++){
            a[i]=1;
        }
        for(int i=zeros+ones;i<a.length;i++){
            a[i]=2;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] A= {0,2,1,2,1,0,1,2,0,1,2,0,1,2,0,1};
        function(A);

    }
}
