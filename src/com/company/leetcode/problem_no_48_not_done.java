package com.company.leetcode;

public class problem_no_48_not_done {
    public void printMatrix(int[][] matrix){
        int N= matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void rotate(int[][] matrix){
        int[][] rotated= new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rotated[i][j]=matrix[j][matrix.length-i-1];
            }
        }
        printMatrix(rotated);
    }

    public static void main(String[] args) {
        int[][] a= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        problem_no_48_not_done ob = new problem_no_48_not_done();
        ob.rotate(a);
    }
}
