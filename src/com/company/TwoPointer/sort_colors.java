package com.company.TwoPointer;

public class sort_colors {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int start=0;
        int end=n-1;
        int index=0;
        while(index<=start){
            if(nums[index]==0){
                swap(nums,start,index);
                start++;
                index++;
            } else if (nums[index]==1) {
                index++;
            }
            else{
                swap(nums,end,index);
                end--;
            }
        }
    }
    static void swap(int[] a,int x,int y){
        int temp = a[x];
        a[x]=a[y];
        a[y]=temp;
    }
}
