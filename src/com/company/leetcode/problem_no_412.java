package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem_no_412 {
    public List<String> fizzBuzz(int n){
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if((i%3==0) && (i%5==0)){
                list.add("FizzBuzz");
            } else if (i%3==0) {
                list.add("Fizz");
            } else if (i%5==0) {
                list.add("Buzz");
            }
            else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        problem_no_412 ob = new problem_no_412();
        ArrayList<String>  ans = (ArrayList<String>) ob.fizzBuzz(4);
        System.out.println(ans);
    }
}
