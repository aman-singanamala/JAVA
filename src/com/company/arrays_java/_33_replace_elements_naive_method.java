package com.company.arrays_java;
public class _33_replace_elements_naive_method {
    public static void replace(int[] array){
        int max=Integer.MIN_VALUE;
        int[] newarray = new int[array.length];
        for(int i=1;i< array.length;i++){
            max=array[i];
            for(int j=i+1;j<array.length;j++){
                max=maximum(max,array[j]);
            }
            newarray[i-1]=max;
        }
        newarray[array.length-1]=-1;
        for (int i = 0; i < newarray.length; i++) {
            System.out.print(newarray[i]+" ");
        }
    }
    public static int maximum(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        int[] a={16,17,4,3,5,2};
        replace(a);
    }
}
