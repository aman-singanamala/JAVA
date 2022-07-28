package com.company.leetcode;

import java.util.Arrays;

public class problem_no_2022 {
    public int[][] constrict2DArray(int[] original,int m,int n){
        if(m*n< original.length|| m*n> original.length){
            return new int[0][0];
        }
        int k=0;
        int[][] ans= new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                ans[i][j]= original[k++];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        problem_no_2022 ob = new problem_no_2022();
        int[] a={1,2,3,4};
        int[][] ans = ob.constrict2DArray(a,2,2);
        for (int i = 0; i < 2; i++) {
            for(int j=0;j<2;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

}
