package com.company.arrays_java;

public class _12_duplicates_of_strings_in_array {
    public static void duplicates(String[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i].equals(array[j])&& (i!=j)){
                    System.out.println(array[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr={"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
        duplicates(arr);
    }
}
