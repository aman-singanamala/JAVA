package com.company.leetcode;
public class problem_no_867 {
    public int[][] transpose(int[][] matrix){
        int m= matrix.length;
        int n= matrix[0].length;
        int[][] temp= new int[n][m];// 3*2 is changed into 2*3 when we transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[j][i]= matrix[i][j];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        problem_no_867 ob = new problem_no_867();
        int[][] a= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] ans = ob.transpose(a);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
