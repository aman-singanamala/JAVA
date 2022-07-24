package com.company.leetcode;

public class problem_no_240 {
    public boolean searchMatrix(int[][] matrix,int target){
        int row=0;
        int col_max= matrix[0].length-1;
        while(row< matrix.length && col_max>=0){
            if(matrix[row][col_max]==target){
                return true;
            } else if (matrix[row][col_max]<target) {
                row++;
            }
            else {
                col_max--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        problem_no_240 ob= new problem_no_240();
        int[][] a= {
                {1,2,3},{4,5,6},{7,8,9}
        };
        boolean ans = ob.searchMatrix(a,8);
        System.out.println(ans);
    }
}
