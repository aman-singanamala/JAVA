package com.company.Random_Practice.Sortings_algorithms;
import java.util.*;


public class sort_matrix {


    public static void sort(int[][] matrix) {
        sortRows(matrix);
        sortColumns(matrix);
    }

    private static void sortRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = mergeSort(matrix[i]);
        }
    }

    private static void sortColumns(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int[] column = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                column[i] = matrix[i][j];
            }
            column = mergeSort(column);
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = column[i];
            }
        }
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k] = left[i];
                i++;
            } else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            merged[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }

    // Testing the code
    public static void main(String[] args) {
        int[][] matrix = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
        System.out.println("Original matrix:");
        printMatrix(matrix);
        sort(matrix);
        System.out.println("Sorted matrix:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}