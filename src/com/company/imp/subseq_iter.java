package com.company.imp;
import java.util.List;
import java.util.ArrayList;
public class subseq_iter {
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
        for(int num : arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal= new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    //TC : O(N*(2^N))  [ 2^N -- TOTAL NUMBER OF SUBSETS ]
    //SC : O((2^N)*N)
}
