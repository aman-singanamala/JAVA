package com.company.leetcode;

public class problem_no_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int k=p1+p2-1;

    }

    public static void main(String[] args) {
        problem_no_88 ob = new problem_no_88();
        int[] a= {1,2,3,0,0,0};
        int[] b= {2,5,6};
        ob.merge(a,3,b,3);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

