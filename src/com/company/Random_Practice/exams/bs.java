package com.company.Random_Practice.exams;

import java.util.Arrays;
import java.util.Scanner;

public class bs {

    static int search(int arr[] , int l, int r , int x){
        if(r>=l){
            int mid= l+(r-l)/2;

            if(arr[mid]== x){
                return mid;
            }
            if(arr[mid]> x){
                return search(arr, l, mid-1, x);

            }

            return search(arr, mid+1, r, x);

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);

        int key = sc.nextInt();

        int result = bs.search(arr,0,n-1,key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " +  result);

    }
}
