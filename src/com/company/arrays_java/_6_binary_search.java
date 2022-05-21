package com.company.arrays_java;
import java.util.Scanner;
public class _6_binary_search {
    public static int search(int[] array,int k){
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]==k){
                return mid;
            }
            if(array[mid]<k){
                start=mid+1;
            }
            else if(array[mid]>k){
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of the Array:");
        n= in.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements of Array:");
        for (int i = 0; i < n; i++) {
            array[i]=in.nextInt();
        }
        System.out.print("Enter the Element to be searched:");
        int k;
        k= in.nextInt();
        int result= search(array,k);
        if(result==-1){
            System.out.println("Element is not present in the Array");
        }
        else{
            System.out.print("Element is present at the index:"+result);
        }

    }
}
