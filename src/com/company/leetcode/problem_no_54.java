package com.company.leetcode;
import java.util.*;
public class problem_no_54 {
    public void spiralOrder(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix.length==0){
            return;
        }
        int m= matrix.length;
        int n= matrix[0].length;
        int i;
        int k=0; // for starting row
        int l=0; // for starting column
        while(k<m && l<n){

            // printing the first column
            for(i=l;i<n;++i){
                System.out.print(matrix[k][i]+" ");
            }
            k++;
            // printing the last column

            for(i =k;i<m;++i){
                System.out.print(matrix[i][n-1]+" ");
            }
            n--;

            // print the last row from the remaining rows

            if(k<m){
                for(i= n-1;i>=l;--i){
                    System.out.print(matrix[m-1][i]+" ");
                }
                m--;
            }

            if(l<n){
                for(i=m-1;i>=k;--i){
                    System.out.print(matrix[i][l]+" ");
                }
                l++;
            }
        }
    }

    public static void main(String[] args) {
        problem_no_54 ob = new problem_no_54();
        int[][] a= {{1,2,3,4},
                {5,6,7,8,9},
                {10,11,12,13}};
        ob.spiralOrder(a);
    }
}
