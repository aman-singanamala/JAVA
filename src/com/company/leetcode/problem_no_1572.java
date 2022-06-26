package com.company.leetcode;

public class problem_no_1572 {
    public int diagonalSum(int[][] mat){
        int sum=0;
        int n= mat.length;
        int j=n-1;
        int i=0;
        for (i = 0; i <j ; i++,j--) {
            sum= sum+mat[i][i]+mat[j][j]+mat[i][j]+mat[j][i];
        }
        if(i==j){
            sum=sum+mat[i][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        problem_no_1572 ob = new problem_no_1572();
        int [][] a= {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        int ans= ob.diagonalSum(a);
        System.out.println(ans);
    }
}
