package com.company.arrays_java;

public class _21_common_elements_in_3sorted_arrays {
    public static void common(int[] a1,int[] a2,int[] a3){
        int i=0,j=0,k=0;
        while(i<a1.length&&j<a2.length&&k<a3.length){
            // If x=y and y=z , print any of them and move ahead in all arrays
            if(a1[i]==a2[j]&& a2[j]==a3[k]){
                System.out.println(a1[i]+" ");
                i++;j++;k++;
            }
            //Else If x < y, we can move ahead in ar1[] as x cannot be a common element.
            else if(a1[i]<a2[j]){
                i++;
            }
            // y < z
            //Else If x > z and y > z), we can simply move ahead in ar3[] as z cannot be a common element.
            else if(a2[j]<a3[k]){
                j++;
            }
            // We reach here when x > y and z < y, i.e., z
            // is smallest
            else{
                k++;
            }
        }
    }
    public static void main(String[] args){
        int[] array1 = {2, 4, 8};
        int[] array2 = {2, 3, 4, 8, 10, 16};
        int[] array3 = {4, 8, 14, 40};
        common(array1,array2,array3);

    }
}
