package com.company.leetcode;
import java.util.HashSet;
public class problem_no_2133 {
    public boolean checkValid(int[][] matrix){
//        final int m= matrix.length;
//        int n= matrix[0].length;
//        for(int i=0;i<m;i++){
//            HashSet<Integer> rows= new HashSet<>();
//            HashSet<Integer> cols= new HashSet<>();
//            for(int j=0;j<n;j++){
//                rows.add(matrix[i][j]);
//                cols.add(matrix[j][i]);
//            }
//            if(Math.min(rows.size(), cols.size())< m){
//                return false;
//            }
//        }
//        return true;
        int m= matrix.length;;
        int n= matrix[0].length;
        HashSet<Integer>[] rowset= new HashSet[m];
        HashSet<Integer>[] colset= new HashSet[n];
        for(int i=0;i<m;i++){
            rowset= new HashSet[m];
            for(int j=0;j<n;j++){
                int value=matrix[i][j];
                if(rowset[i].contains(value)||(colset[j]!=null && colset[j].contains(value))){
                    return false;
                }
                rowset[i].add(value);
                if(colset[j]==null){
                    colset[j]= new HashSet<>();
                }
                colset[j].add(value);
            }
        }
        return true;
    }
}