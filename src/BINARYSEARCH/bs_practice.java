package BINARYSEARCH;

import java.sql.SQLData;

public class bs_practice {
    // check if a number has square root or not
    public static boolean isPerfectSquare(int number) {
        if (number < 0) {
            return false;
        }
        if (number == 1) {
            return true;
        }

        long left = 1;
        long right = number / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            if (square == number) {
                return true;
            } else if (square < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return true;
    }

    // find first value that is greater than or equal to x
    public static int lowerbound(int[] nums, int x) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= x) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        if (nums[left] <= nums[right]) {
            return left;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;
            if (nums[mid] < nums[prev] && nums[mid] < nums[next]) {
                return mid;
            }

            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else if (nums[mid] <= nums[right]) {
                right = mid - 1;
            }

        }
        return -1;
    }
    // Function to find the square root of a number
    public static double findSqrt(int x) {
        double l = 0;
        double r = x;
        double precision= 0.00001;
        while(r-l>=precision){
            double mid= l+(r-l)/2;
            double square = mid*mid;
            if(square<x){
                l=mid;
            } else if (square>x) {
                r=mid;
            }
        }
        return l;
    }

    // 4. Median of Two Sorted Arrays
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] merged=merger(nums1,nums2);
        double median;
        int n= merged.length;
        if(n%2==0){
            int mid= n/2;
            int a= merged[mid-1];
            int b= merged[mid];
            median= (double)(a+b)/2;
        }else {
            median = merged[n/2];
        }
        return median;

    }

    public int[] merger(int[] a, int[] b){
        int i=0;
        int j=0;
        int k=0;
        int[] merged= new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                merged[k++]=a[i++];
            }else merged[k++]=b[j++];
        }
        while(i<a.length){
            merged[k++]=a[i++];
        }
        while(j<b.length){
            merged[k++]=b[j++];
        }
        return merged;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col= matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }




    public static void main(String[] args) {
        System.out.println(findSqrt(5));
    }

}
