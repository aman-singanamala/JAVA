package com.company.arrays_java;
import java.util.Scanner;
public class sum_of_values_in_array {
    public static void add(int array[]){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        int array[]= new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=in.nextInt();
        }
        System.out.println("Sum of elements in the arrays is:");
        add(array);
    }
}