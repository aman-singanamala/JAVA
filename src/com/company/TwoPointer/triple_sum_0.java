package com.company.TwoPointer;

import java.util.Arrays;

public class triple_sum_0 {
    public void findTriplets(int[] arr){
        boolean ans= false;
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int l=i+1;
            int r=n-1;
            int x=arr[i];
            while(l<r){
                if(x+arr[l]+arr[r]==0){
                    System.out.print(x+" ");
                    System.out.print(arr[l]+" ");
                    System.out.print(arr[r]+" ");
                    System.out.println();
                    l++;
                    r--;
                    ans=true;
                } else if (x+arr[l]+arr[r]<0) {
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        if(ans==false){
            System.out.println("Triplets not found");
        }
    }

    public static void main(String[] args) {
        int[] a= {0,1,2,-3,1};
        triple_sum_0 ob = new triple_sum_0();
        ob.findTriplets(a);
    }
}
