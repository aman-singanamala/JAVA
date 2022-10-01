package com.company.GFG;
import java.util.ArrayList;
public class subarray_sum {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list = new ArrayList<>();
        // Your code here
        for(int i=0;i<n;i++){
            int currentsum= arr[i];
            if(currentsum== s){
                list.add(i+1);
                return list;
            }

            else{
                for(int j= i+1;j<n;j++){
                    currentsum= currentsum+arr[j];
                    if(currentsum== s){
                        list.add(i+1);
                        list.add(j+1);
                        return list;
                    }
                }
            }
        }
        return list;
    }
}
