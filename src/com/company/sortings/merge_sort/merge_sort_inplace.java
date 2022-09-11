package com.company.sortings.merge_sort;
import java.util.Arrays;
public class merge_sort_inplace {
    public static void main(String[] args){
        int A[]={5,4,3,2,1};
        mergesortInPlace(A,0,A.length);
        System.out.println(Arrays.toString(A));

    }
    static void mergesortInPlace(int[] a,int s,int e){
        if(e-s==1){
            return ;
        }
        int mid= (s+e)/2;
        mergesortInPlace(a,s,mid);
        mergesortInPlace(a,mid,e);
        merge(a, s, mid,e);

    }
    static void merge(int[] a,int s,int m,int e){
        int[] ans= new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if(a[i]<a[j]){
                ans[k]= a[i];
                k++;
                i++;
            }
            else{
                ans[k]= ans[j];
                k++;
                j++;
            }
        }
        while(i<m){
            ans[k]=a[i];
            k++;
            i++;
        }
        while(j<e){
            ans[k]=a[j];
            k++;
            j++;
        }
        for(int z=0;z<a.length;z++){
            a[s+z]=ans[z];
        }
    }
}
