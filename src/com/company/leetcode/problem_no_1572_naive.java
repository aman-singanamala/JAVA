package com.company.leetcode;

public class problem_no_1572_naive {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i< mat.length;i++){
            for (int j = 0; j < mat.length; j++) {
                if(mat.length%2!=0){
                    if ((i == j) || (i == mat.length - j - 1)) {
                        sum=sum+mat[i][j];
                    }
                }
                else{
                    if ((i == j) || (i == mat.length - j - 1)) {
                        sum=sum+mat[i][j];
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        problem_no_1572_naive ob = new problem_no_1572_naive();
        int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
        int ans= ob.diagonalSum(a);
        System.out.println(ans);
    }
}
