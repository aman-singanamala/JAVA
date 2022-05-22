package com.company.arrays_java;

import java.util.Scanner;

public class _16_add_two_matrices {
    public static int[][] add(int[][] array1,int[][] array2,int size){
        int[][] array3 = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                array3[i][j]=array1[i][j]+array2[i][j];
            }
        }
        return array3;
    }
    // function to print a matrix
    public static void printmatrix(int[][] a){
        for(int i=0;i<a.length;i++){
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Enter the size of the Matrix:");
        n=in.nextInt();
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        System.out.println("Enter the elements of the matrix 1:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the elements of the matrix 2:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=in.nextInt();
            }
        }
        int[][] arr3=add(arr1,arr2,n);
        System.out.println("Addition of matrices is :");
        printmatrix(arr3);

    }
}
