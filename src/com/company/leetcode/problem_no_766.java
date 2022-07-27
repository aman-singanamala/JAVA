package com.company.leetcode;

public class problem_no_766 {
    public boolean isToelitzMatrix(int[][] matrix){
        int m= matrix.length;
        int n= matrix[0].length;
        boolean ans= true;
        for(int i=0;i< m;i++){
            for (int j = 0; j < n; j++) {
                if(i>0 && j>0 && matrix[i-1][j-1]!=matrix[i][j])
                    return false;
                }
            }
        return true;
    }
    public static void main(String[] args) {
        problem_no_766 ob = new problem_no_766();
        int[][] a = {
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}
        };
        boolean ans = ob.isToelitzMatrix(a);
        System.out.println(ans);
    }
}
