//package com.company.leetcode;
//
//import java.util.HashSet;
//
//public class problem_no_2133 {
//    public boolean checkValid(int[][] matrix){
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < matrix.length; i++) {
//
//            int sum=0;
//            for (int j = 0; j < matrix[0].length; j++) {
//                sum= sum+matrix[i][j];
//            }
//        }
//        if(set.size()==1){
//            return false;
//        }
//        return true;
//    }

//    public static void main(String[] args) {
//        problem_no_2133 ob = new problem_no_2133();
//        int[][] a= {
//                {1,1,1},
//                {1,2,3},
//                {1,2,3},
//        };
//        boolean ans= ob.checkValid(a);
//        System.out.println(ans);
//    }
//
//}
