package com.company.imp;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/*When you find a duplicate element, only add it in the
newly created subset of the previous step
 */
/* what is arrays [2,1,2]
Duplicates have to be together becayse of the other point. so sort the array
 */
public class SUBSET_DUP {
    public static void main(String[] args){
        int[] a={2,1,2};
        List<List<Integer>> ans = subset_dup(a);
        for(List<Integer> list : ans){
            System.out.println(list);
        }

    }
    static List<List<Integer>> subset_dup(int[] array){
        Arrays.sort(array);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;

        for(int i=0;i<array.length;i++){
            start=0;
            //ifcurrent and previous element is same , s=e+1
            if(i>0 && array[i]==array[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n= outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(array[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
