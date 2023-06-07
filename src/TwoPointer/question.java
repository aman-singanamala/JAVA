package TwoPointer;
import java.util.*;

public class question {
    public boolean findTriplets(int arr[], int n) {
        Arrays.sort(arr); // Sort the array in ascending order

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    return true; // Triplet with zero sum found
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false; // No triplet with zero sum found
    }

    //Given an array of distinct integers.
    // The task is to count all the triplets such that sum of two elements equals the third element.
    public static int countTriplet(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int count=0;
        for(int i=n-1;i>=0;i--){
            int right=n-1;
            int left=0;
            while(left<right){
                if(arr[left]+arr[right]==arr[i]){
                    count++;
                    left++;
                    right--;
                }else if(arr[left]+arr[right]<arr[i]){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return count;
    }


    public static int remove_duplicate(int nums[],int N){
        // code here
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        int j = 1;

        while (j < N) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return i + 1;
    }

    



}
