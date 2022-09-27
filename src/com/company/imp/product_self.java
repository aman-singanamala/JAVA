package com.company.imp;
import java.util.Arrays;
public class product_self {
    static int[] func(int[] array,int n){
        int[] ans= new int[n];
        for(int i=0;i<n;i++){
            int product= 1;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                product= product*array[j];
            }
            ans[i]= product;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        int n= arr.length;
        int[] ans= func(arr,n);
        System.out.println(Arrays.toString(ans));
    }
}
