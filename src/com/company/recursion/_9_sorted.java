package com.company.recursion;

public class _9_sorted {
    static boolean sorted(int[] arr,int index){
        if(index== arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }

    public static void main(String[] args) {
        int[] a= {1,2,3,44,5,6,7};
        boolean ans=sorted(a,0);
        if(ans){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }
    }
}
