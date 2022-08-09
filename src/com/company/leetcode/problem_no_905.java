package com.company.leetcode;
import java.util.*;
public class problem_no_905 {
    // We maintain two pointers start and end, start will point to the first element
    // of the array and end will point to the last element of the array.
    //We keep incrementing the start index until we encounter an odd element.
    // If we encounter an odd element
    // then we will start decrementing the end index until we find an even element.
    // Once an even element is found we will swap the odd and even element
    public int[] sortArrayByParity(int[] nums){
        int n= nums.length;
        int i=0;
        int j=n-1;

        while(i<j){
            if(nums[i]%2==0){
                i++;
            }
            else{
                if(nums[j]%2==0){
                    int temp= nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        problem_no_905 ob = new problem_no_905();
        int[] a= {3,1,2,4};
        int[] res= ob.sortArrayByParity(a);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}