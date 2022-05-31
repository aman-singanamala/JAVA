package com.company.arrays_java;
import java.util.Arrays;
public class _27_kth_smallest_element {
    public static int kthsmallest(int[] array,int k){
        if(array.length==0){
            return 0;
        }
        Arrays.sort(array);
        return array[k-1];
    }

    public static void main(String[] args) {
        int[] a= {7 ,10, 4 ,3 ,20, 15};
        int b=3;
        int ans= kthsmallest(a,b);
        System.out.println(ans);
    }
}
