package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class problem_no_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> candyList= new ArrayList<Boolean>(candies.length);
        int max= candies[0];
        int temp ;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            temp=candies[i]+extraCandies;
            if(temp>=max){
                candyList.add(true);
            }
            else{
                candyList.add(false);
            }
        }
        return candyList;
    }

    public static void main(String[] args) {
        problem_no_1431 ob= new problem_no_1431();
        int[] a= {4,2,1,1,2};
        List<Boolean> ans = ob.kidsWithCandies(a,1);
        System.out.println(ans);
    }
}
