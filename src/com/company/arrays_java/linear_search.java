package com.company.arrays_java;
import java.util.Scanner;
public class linear_search {
    public static int search(int[] array,int k){
        for(int i=0;i<array.length;i++){
            if(array[i]==k){
                return i;
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
