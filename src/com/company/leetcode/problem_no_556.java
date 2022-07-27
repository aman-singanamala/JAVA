package com.company.leetcode;

public class problem_no_556 {
    public int[][] matrixReshape(int[][] mat,int r,int c){
        int m= mat.length;
        int n= mat[0].length;
        int[] arr= new int[m*n];
        int[][] ans = new int[r][c];
        if(m*n!=r*c)
            return mat;
        int k=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j<n ; j++) {
                arr[k++]= mat[i][j];
            }
        }
        int z=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j]= arr[z++];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        problem_no_556 ob= new problem_no_556();
        int[][] a= {
                {1,2},
                {3,4}
        };
        int[][] aa= new int[1][4];
        aa= ob.matrixReshape(a,1,4);
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(aa[i][j]+" ");
            }
            System.out.println();
        }
    }

}
