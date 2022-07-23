package com.company.recursion;

import java.util.Arrays;

public class _10_linear_search {
    static boolean linearsearch(int[] array,int target,int index){
        if(index== array.length){
            return false;
        }
        return array[index]==target || linearsearch(array,target,index+1);
    }
    static int findindex(int[] array,int target,int index){
        if (index==array.length){
            return -1;
        }
        if(array[index]==target){
            return index;
        }
        else {
            return findindex(array,target,index+1);
        }
    }
    public static void main(String[] args) {
        int[] a= {1,2,5,6,9,8,4,2,66};
        int ans= findindex(a,4,0);
        System.out.println(ans);

    }
}
