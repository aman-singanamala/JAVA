package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class problem_no_350 {
    public int[] intersect(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1= nums1.length;
        int n2= nums2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                i++;
            } else if (nums1[i]>nums2[j]) {
                j++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result= new int[list.size()];
        int l=0;
        while(l<list.size()){
            result[l]= list.get(l);
            l++;
        }
        return result;
    }

    public static void main(String[] args) {
        problem_no_350 ob= new problem_no_350();
        int[] a= {1,1,2,5,1,2,2};
        int[] b={1 ,2,2};
        int[] ans=ob.intersect(a,b);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}