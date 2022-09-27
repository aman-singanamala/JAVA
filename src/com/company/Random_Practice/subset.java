package com.company.Random_Practice;
import java.util.List;
import java.util.ArrayList;
public class subset {
    public static void main(String[] args){
        int[] array ={1,2,3};
        List<List<Integer>> ans = subset(array);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n= outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}