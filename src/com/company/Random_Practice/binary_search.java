package com.company.Random_Practice;

public class binary_search {
    public int BS(int[] nums,int target){
        int start=0;
        int end= nums.length-1;
        while(start<end){
            int mid= start+((end-start)/2);
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        binary_search ob = new binary_search();
        int[] a= {1,2,3,4,5,6};
        int ans= ob.BS(a,3);
        System.out.println(ans);
    }
}
