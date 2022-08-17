package com.company.Random_Practice;
/*Given an array of integers arr[]of size N and an integer,
the task is to rotate the array elements to the left by d positions.*/
public class rotate_by_d {
    public int[] rotate(int[] nums,int d){
        int[] temp = new int[nums.length];
        int k=0;
        for(int i=d;i< nums.length;i++){
            temp[k++]=nums[i];
        }
        for(int i=0;i<d;i++){
            temp[k++]= nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        rotate_by_d ob = new rotate_by_d();
        int[] a= {3, 4, 5, 6, 7, 1, 2};
        int[] ans = ob.rotate(a,2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
