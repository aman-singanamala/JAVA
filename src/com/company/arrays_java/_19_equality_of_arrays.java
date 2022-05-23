package com.company.arrays_java;

public class _19_equality_of_arrays {
    public static void check(int[] array1,int[] array2){
        boolean not_equal=true;
        if(array1.length==array2.length){
            for(int i=0;i< array1.length;i++){
                if(array1[i]!=array2[i]){
                    not_equal=true;
                }
                else{
                    not_equal=false;
                }
            }
        }
        else{
            System.out.println("Since the length is not equal,the arrays are not equal obviously");
        }
        if(not_equal){
            System.out.println("Array are not equal");
        }
        else{
            System.out.println("Array are Equal");
        }
    }

    public static void main(String[] args) {
        int[] a={5,4,6,3,6};
        int[] b={5,4,6,3,6};
        check(a,b);
    }
}

