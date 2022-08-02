package com.company.TwoPointer;

import java.util.Arrays;

public class triple_sum_value {
    public void function(int[] A,int target){
        boolean ans=false;
        Arrays.sort(A);
        int n=A.length;
        for (int i = 0; i < n; i++) {

            int l=i+1;
            int r=n-1;
            int x= A[i];
            while(l<r){
                if(A[l]+A[r]+x==target){
                    System.out.print(x+" ");
                    System.out.print(A[l]+" ");
                    System.out.print(A[r]+" ");
                    System.out.println();
                    l++;
                    r--;
                } else if (A[l]+A[r]+x<target) {
                    l++;
                }else{
                    r--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a= {0,1,2,-3,1};
        triple_sum_value ob= new triple_sum_value();
        ob.function(a,0);
    }
}
