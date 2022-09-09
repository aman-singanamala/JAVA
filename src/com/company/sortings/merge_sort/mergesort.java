package com.company.sortings.merge_sort;
import java.util.Arrays;
public class mergesort {
    static int[] mergesort(int[] a){
        if(a.length==1){
            return a;
        }
        int mid = a.length/2;
        int[] left=mergesort(Arrays.copyOfRange(a,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(a,mid,a.length));
        return merge(left,right);
    }
    static int[] merge(int[] l,int[] r){
        int i=0;
        int j=0;
        int k=0;
        int[] ans= new int[l.length+r.length];
        while(i<l.length && j<r.length){
            if(l[i]<=r[j]){
                ans[k]=l[i];
                k++;
                i++;
            }
            else{
                ans[k]=r[j];
                k++;
                j++;
            }
        }
        while(i<l.length){
            ans[k]=l[i];
            k++;
            i++;
        }
        while(j<r.length){
            ans[k]= r[j];
            k++;
            j++;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] A={-1,-6,-8,6,3,2,8,9,7,4,1,50,55};
        A= mergesort(A);
        System.out.println(Arrays.toString(A));
    }
}
