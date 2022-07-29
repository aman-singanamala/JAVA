package com.company.leetcode;

import java.util.Arrays;

public class problem_no_861 {
    public int matrix(int[][] A){
        int m = A.length; //number of rows
        int n = A[0].length; //num of cols

        //count[i] represents num of 1s in col i
        int[] count = new int[n];

        //flip row and count 1s in each col
        for(int i=0;i<m;i++)
        {
            boolean flip = A[i][0] == 0;
            for(int j=0;j<n;j++)
            {
                if(flip)
                    A[i][j] ^= 1;
                count[j] += A[i][j];
            }
        }

        int rst = 0;
        //calculate rst and also flip col if needed
        for(int j=n-1, temp=1;j>=0; j--, temp*=2)
        {
            int num0 = m - count[j];
            if(num0 > count[j]) //flip col
                count[j] = num0;
            rst += temp* count[j];
        }

        return rst;


    }
//    static int[][] flip(int[][] grid){
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                grid[i][j]=1-grid[i][j];
//            }
//        }
//        return grid;
//    }
//    static int convert(long binary){
//        int ans=0;
//        int i;
//        while(binary>0){
//            i=0;
//            ans= (int) (ans+((binary%10)*Math.pow(2,i)));
//            i=i+1;
//            binary=binary/10;
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        int[][] a ={
                {0,0,1,1},
                {1,0,1,0},
                {1,1,0,1,}
        };
        problem_no_861 ob = new problem_no_861();
        int ans= ob.matrix(a);
        System.out.println(ans);
    }

}
