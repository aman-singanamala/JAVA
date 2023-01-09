package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class problem_no_599 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        // create a map to store the index of each string in list1
        HashMap<String, Integer> map = new HashMap<>();
        // create a list ti store the common strings with minimum index value
        ArrayList<String> result= new ArrayList<>();
        int minIndexSum=Integer.MAX_VALUE;
        for(int i=0;i< list1.length;i++){
            map.put(list1[i],i);
        }

        for(int i=0;i< list2.length;i++){
            Integer j= map.get(list2[i]);

            if(j!=null && i+j<=minIndexSum){
                if(i+j<minIndexSum){
                    result.clear();
                    minIndexSum=i+j;
                }
                result.add(list2[i]);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
