package com.company.leetcode;

import java.util.ArrayList;

public class problem_no_989 {
    public ArrayList<Integer> addToArrayForm(int[] num, int k) {
        int sum=0;

        for(int j=0;j<num.length;j++){
            sum= (sum*10)+num[j];
        }

        int ans= sum+k;

        ArrayList<Integer> arrayList = new ArrayList<>();
        while(ans>0){
            int digit= ans%10;
            arrayList.add(0,digit);
            ans=ans/10;

        }

        return arrayList;


    }
}
