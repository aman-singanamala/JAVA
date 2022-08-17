package com.company.leetcode;

public class problem_no_48 {
    public void rotate(int[][] matrix){
        //  Tranpose
        int m= matrix.length;;
        int n= matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        // Reverse
        for(int i=0;i<m;i++){
            for (int j = 0; j < n/2; j++) {
                int temp= matrix[i][j];
                matrix[i][j]= matrix[i][n-j-1];
                matrix[i][n-j-1]= temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] a ={{1,2,3},
                {4,5,6},
                {7,8,9}};
        problem_no_48 ob = new problem_no_48();
        ob.rotate(a);
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
