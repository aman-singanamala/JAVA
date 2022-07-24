package com.company.arrays_java;

import java.util.Arrays;

public class _38_searchng_2D_matrix {
    public int[] search(int[][] matrix, int target){
        int r=0;
        int c= matrix.length-1;

        while(r< matrix.length && c>=0){
            if(matrix[r][c]== target){
                return new int[]{r,c};
            }
            if(matrix[r][c] <target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        _38_searchng_2D_matrix ob= new _38_searchng_2D_matrix();
        int[][] array=  {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(ob.search(array,50)));
    }
}
