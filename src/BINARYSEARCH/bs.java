package BINARYSEARCH;

import java.util.*;

public class bs {
    public static double square_root_x(double n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }

        if (n == 0) {
            return 0;
        }

        double left = 0;
        double right = n;
        double precision = 0.00001;

        while (right - left > precision) {
            double mid = left + (right - left) / 2;
            double square = mid * mid;

            if (Math.abs(square - n) < precision) {
                return mid;
            } else if (square < n) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return left;
    }


    public static int lowerBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lowerBound = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                lowerBound = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return lowerBound;
    }

    public static ArrayList<Integer> twosum(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        ArrayList<Integer> result = new ArrayList<>();
        while (left <= right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                result.add(left);
                result.add(right);
                return result;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        result.add(-1);
        result.add(-1);
        return result;
    }

    public static int minOperations(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        int count = 0;
        while (true) {
            if (allEqual(array)) {
                break;
            }

            count++;

            int gcd = array[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                int prev = array[i];
                array[i] = calculateGCD(array[i], gcd);
                gcd = prev;
            }
        }

        return count;
    }

    public static boolean allEqual(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }


    public static int Findpeakelement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return nums[mid];
            } else if (nums[mid + 1] > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums[left];
    }

    public static int OrderAgnosticBinarySearch(int[] array, int k) {
        int start = 0;
        int end = array.length - 1;
        boolean isAsc = array[start] < array[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == k) {
                return mid;
            } else if (isAsc) {
                if (array[mid] < k) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (array[mid] > k) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;

    }

    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    private int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                index = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    private int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    public static int findKRotation(int arr[], int n) {
        // code here
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            // If the array is already sorted, no rotation has occurred
            if (arr[low] <= arr[high])
                return low;

            int mid = low + (high - low) / 2;
            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;

            // Check if the mid element is the smallest element
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev])
                return mid;

            // If the right half is sorted, the rotation lies in the left half
            if (arr[mid] <= arr[high])
                high = mid - 1;
                // If the left half is sorted, the rotation lies in the right half
            else if (arr[mid] >= arr[low])
                low = mid + 1;
        }

        return -1;
    }

    // Normal binary search code
    public static int bs(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // search in a rotated sorted array
    public static int searchinrotated(int[] nums, int target) {
        int midIndex = findKRotation(nums, nums.length);
        int n = nums.length;
        if (midIndex == 0) {
            return bs(nums, 0, n - 1, target);
        }
        if (nums[0] <= target) {
            return bs(nums, 0, midIndex - 1, target);
        } else {
            return bs(nums, midIndex, n - 1, target);
        }
    }

    // search in almost sorted array
    public static int searchalmost(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid - 1] == target && mid - 1 >= left) {
                return mid - 1;
            }
            if (nums[mid + 1] == target && mid + 1 <= right) {
                return mid + 1;
            }

            if (nums[mid] < target) {
                left = mid + 2;
            } else {
                right = mid - 2;
            }
        }
        return -1;
    }


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


    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6, 7, 9, 0, -1};
        System.out.println(Findpeakelement(nums));
    }
}
