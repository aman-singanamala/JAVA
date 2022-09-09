package com.company.recursion;
import java.util.Arrays;
public class mergesort_recursion {
    public static void main(String[] args){
        int[] array = {5,4,3,2,1};
        array= mergesort(array);
        System.out.println(Arrays.toString(array));
    }
    static int[] mergesort(int[] a){
        if(a.length==1){
            return a;
        }
        int mid= a.length/2;
        int[] left= mergesort(Arrays.copyOfRange(a,0 ,mid));
        int[] right= mergesort(Arrays.copyOfRange(a,mid,a.length));
        return merge(left,right);
    }
    static int[] merge(int[] a,int[] b){
        int i=0;
        int j=0;
        int k=0;
        int merged[] = new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                merged[k]=a[i];
                i++;
                k++;
            }
            else{
                merged[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<a.length){
            merged[k]= a[i];
            i++;
            k++;
        }
        while(j<b.length){
            merged[k]=b[j];
            j++;
            k++;
        }
        return merged;
    }

}
