package com.company.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class problem_no_1329 {
    public int[][] diagonalSort(int[][] mat){
        int m= mat.length;
        int n=mat[0].length;
        //row=0
        // 3 3 1 1
        // 2 2 1 2
        // 1 1 1 2
        // in above matrix we start with
        // mat[0][0] and sort upto mat[3][3] diagonally
        // mat[0][1] and sort upto mat[3][4] diagonally
        // mat[0][2] and sort upto mat[2][4] diagonally
        // mat[0][4] single element
        for(int col=0;col<n;col++){
            sort(mat,0,col,m,n);
        }


        //col=0
        for(int row= 1;row<m;row++){
            sort(mat,row,0,m,n);
        }
        return mat;
    }
    static void sort(int[][] mat,int row,int col,int m,int n){
        List<Integer> values= new ArrayList<>();
        int r= row;
        int c= col;
        // add values from diagonal to a list
        while(r<m && c< n){
            values.add(mat[r][c]);
            r++;
            c++;
        }
        // sort the list
        int index=0;
        Collections.sort(values);
        r= row;
        c=col;
        while(r<m && c<n){
            mat[r][c]=values.get(index++);
            r++;
            c++;
        }
    }
    public static void main(String[] args) {
        problem_no_1329 ob = new problem_no_1329();
        int[][] a= {
                {3,3,1,1},
                {2,2,1,2},
                {1,1,1,2}
        };
        int[][] ans = ob.diagonalSort(a);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
