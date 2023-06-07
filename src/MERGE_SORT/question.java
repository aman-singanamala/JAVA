package MERGE_SORT;

import java.util.*;

public class question {
    public static int countInversions(int[] arr) {
        int[] temp = new int[arr.length]; // Create a temporary array to store merged subarrays
        return mergeSort(arr, temp, 0, arr.length - 1); // Call the merge sort method
    }

    private static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            // Recursively divide the array into halves and merge them back
            count += mergeSort(arr, temp, left, mid);
            count += mergeSort(arr, temp, mid + 1, right);
            count += merge(arr, temp, left, mid + 1, right);
        }
        return count;
    }

    private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int count = 0;
        int i = left; // Pointer for the left subarray
        int j = mid; // Pointer for the right subarray
        int k = left; // Pointer for the merged array

        while (i <= mid - 1 && j <= right) {
            // Compare elements from both halves and merge them into the temporary array
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                // An inversion is detected when an element from the right half is smaller than an element from the left half
                count += mid - i; // Increment the count by the number of remaining elements in the left subarray
            }
        }

        while (i <= mid - 1) {
            // Copy any remaining elements from the left subarray to the temporary array
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            // Copy any remaining elements from the right subarray to the temporary array
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            // Copy the merged elements from the temporary array back to the original array
            arr[i] = temp[i];
        }

        return count;
    }

    // Function to count possible triangles

    static int countTriangles(int[] arr, int n){
        Arrays.sort(arr);
        int count=0;
        for(int i=n-1;i>=2;i--){
            int left=0;
            int right=i-1;
            while(left<right){
                if(arr[left]+arr[right]> arr[i]){
                    count+= right-left;
                }else{
                    left++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};

        int inversions = countInversions(arr);
        System.out.println("Number of inversions: " + inversions);
    }
}
