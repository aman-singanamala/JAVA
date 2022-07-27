package com.company.leetcode;
public class problem_no_2319 {
    public boolean checkMatrix(int[][] grid) {
        int m = grid.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == m - 1) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else if (grid[i][j] > 0) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[][] a= {
                {2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}
        };
        problem_no_2319 ob = new problem_no_2319();
        boolean ans = ob.checkMatrix(a);
        System.out.println(ans);
    }
}

