package com.company.Random_Practice.Sortings_algorithms;
import java.util.*;
public class merge_Sort {


    static int[] sort(int[] A){
        if(A.length==1){
            return A;
        }
        int mid= A.length/2;

        int[] left= sort(Arrays.copyOfRange(A, 0, mid));
        int[] right= sort(Arrays.copyOfRange(A, mid, A.length));
        return merger(left, right);

    }

    static int[] merger(int[] a, int[] b){
         int i=0, j=0, k=0;
         int[] ans= new int[a.length+ b.length];
         while(i<a.length && j<b.length){
             if(a[i]<=b[j]){
                 ans[k++]= a[i++];
             }else{
                 ans[k++]= b[j++];
             }
         }

         while (i<a.length){
             ans[k++]= a[i++];
         }
         while(j<b.length){
             ans[k++]= b[j++];
         }

         return ans;
    }

    public static void main(String[] args) {
        int[] A={-1000,5,66,98,-89,89,56,65,-65};
        A= sort(A);
        System.out.println(Arrays.toString(A));
    }
}
