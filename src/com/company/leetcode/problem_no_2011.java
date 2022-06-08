package com.company.leetcode;

import java.util.Objects;

public class problem_no_2011 {
    public int finalValueAfterOperations(String[] operations){
        int value=0;
        if(operations!=null){
            for (String operation : operations) {
                if ((Objects.equals(operation, "X--")) || Objects.equals(operation, "--X")) {
                    value = value - 1;
                }
                else if ((Objects.equals(operation, "X++")) || Objects.equals(operation, "++X")){
                    value=value+1;
                }
            }
        }
        return value;
    }
}
