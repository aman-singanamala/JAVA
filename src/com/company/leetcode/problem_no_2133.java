package com.company.leetcode;

import java.util.HashSet;

public class problem_no_2133 {
    public boolean checkValid(int[][] matrix){
        final int m= matrix.length;
        int n= matrix[0].length;
        for(int i=0;i<m;i++){
            HashSet<Integer> rows= new HashSet<>();
            HashSet<Integer> cols= new HashSet<>();
            for(int j=0;j<n;j++){
                rows.add(matrix[i][j]);
                cols.add(matrix[j][i]);
            }
            if(Math.min(rows.size(), cols.size())< m){
                return false;
            }
        }
        return true;
    }
}

