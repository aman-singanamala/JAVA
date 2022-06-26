package com.company.leetcode;

public class problem_no_1351_naive {
    public int countNegatives(int[][] grid){
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        problem_no_1351_naive ob = new problem_no_1351_naive();
        int[][] a= {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        int ans= ob.countNegatives(a);
        System.out.println(ans);
    }
}
