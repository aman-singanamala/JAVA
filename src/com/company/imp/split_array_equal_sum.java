package com.company.imp;

public class split_array_equal_sum {
    static int returnindex(int[] array,int n){
        int leftsum=0;
        for(int i=0;i<n;i++){
            leftsum= leftsum+array[i];
            int rightsum=0;
            for(int j=i+1;j<n;j++){
                rightsum= rightsum+array[j];
            }
            if(leftsum==rightsum){
                return i+1;
            }
        }
        return -1;
    }
    static void printPartitions(int[] array,int n){
        int point = returnindex(array,n);
        if(point ==-1 || point ==array.length){
            System.out.println("Not Possible");
            return ;
        }
        for(int i=0;i< n;i++){
            if(point==i){
                System.out.println();
            }
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,5};
        int n= arr.length;
        printPartitions(arr,n);
    }
}
