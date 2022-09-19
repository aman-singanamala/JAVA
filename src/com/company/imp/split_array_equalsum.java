package com.company.imp;

public class split_array_equalsum {
    static int findindec(int[] array, int n){
        int left_sum=0;
        for(int el: array){
            left_sum= left_sum+el;
        }

        for(int i=n-1;i>=0;i--){
            int rightsum=0;
            left_sum= left_sum- array[i];
            rightsum= rightsum+array[i];
            if(left_sum==rightsum){
                return i;
            }

        }
        return -1;
    }
    static void print(int[] array, int n){
        int point = findindec(array,n);
        if(point==1 || point == n){
            System.out.println("Not possible");
        }
        for(int i=0;i<n;i++){
            if(i==point){
                System.out.println();
            }
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,6};
        int n= arr.length;
        print(arr,n);
    }
}
