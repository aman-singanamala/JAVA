package com.company.arrays_java;
public class _23_even_odd_nums_inarray {
    public static void evenodd(int[] array){
        int even=0,odd=0;
        for(int i=0;i< array.length;i++){
            if((array[i]%2)==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even number count = "+even);
        System.out.println("Odd number count = "+odd);
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,9,7,9,4,4,5};
        evenodd(a);
    }
}
