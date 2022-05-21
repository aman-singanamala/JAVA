package com.company.arrays_java;

import java.util.Scanner;

public class _2_average_in_array {
    public static void average(int[] array){
        double sum=0;
        for (int j : array) {
            sum = sum + j;
        }
        double average;
        average=sum/array.length;
        System.out.println(average);
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        int[] array = new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=in.nextInt();
        }
        System.out.println("Average of elements in the arrays is:");
        average(array);
    }
}
