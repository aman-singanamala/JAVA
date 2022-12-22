package com.company.leetcode;

import java.util.HashSet;

public class problem_no_36 {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> rows = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(rows.contains(board[i][j])){
                        return false;
                    }else{
                        rows.add(board[i][j]);
                    }
                }
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character> cols = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                    if(cols.contains(board[j][i])){
                        return false;
                    }else{
                        cols.add(board[j][i]);
                    }
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                HashSet<Character> sub= new HashSet<>();
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        int row= i*3+k;
                        int col= j*3+l;
                        if(board[row][col]!='.'){
                            if(sub.contains(board[row][col])){
                                return false;
                            }
                            else{
                                sub.add(board[row][col]);
                            }
                        }
                    }
                }
            }
        }
        return true;


    }
}
