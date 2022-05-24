package com.company.arrays_java;
import java.util.Arrays;
public class _24_separate_even_odd_array {
    public static void separate(int[] array){
        int ec=0,oc=0;
        for(int i=0;i< array.length;i++){
            if((array[i]%2)==0){
                ec++;
            }
            else{
                oc++;
            }
        }
        int[] even=new int[ec];
        int[] odd=new int[oc];
        int e=0;
        int o=0;
        for(int i=0;i<array.length;i++){
            if((array[i]%2)==0){
                even[e++]=array[i];
            }
            else{
                odd[o++]=array[i];
            }
        }
        System.out.println("Even Array:"+Arrays.toString(even));
        System.out.println("Odd Array:"+Arrays.toString(odd));

    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        separate(a);


    }

}

