package com.company.leetcode;

public class problem_no_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;     // nums1's index (actual nums)
        int j = n - 1;     // nums2's index
        int k = m + n - 1; // nums1's index (next filled position)

        while (j >= 0)
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
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

