package com.company.arrays;

// Also known as Sinking Sort or Exchange Sort
import java.util.Scanner;
public class sort {
    static void BB(int array[]){
        int temp;
        boolean swapped= false;
        //running in the steps n-1 times
        for(int i=0;i<array.length;i++){
            //for each step maximum item will come at the last respective index
            for(int j=1;j< array.length-i;j++){
                temp=array[j];
                if(array[j]<array[j-1]){
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of . that means the array is sored hence stop the swapping
            if(!swapped){
                break;
            }
        }
    }
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int n;
        System.out.print("Enter the size of the Array:");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        System.out.print("Enter the Numbers present in the array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        BB(arr);
        System.out.print("Sorted Array is:");
        printarray(arr);

    }
}