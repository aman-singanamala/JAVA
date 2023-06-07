package Recursion;

import java.util.*;

public class basics {
    // An example of an infinite recursion
    static void f() {
        System.out.println(1);
        f();
    }

    // Recursive function to calculate factorial of a number
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Recursive function to calculate nth Fibonacci number
    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else return fib(n - 1) + fib(n - 2);
    }

    // Recursive function to calculate sum of numbers from 1 to n
    static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    // Recursive function to calculate sum of digits of a number
    static int sumOfDigits(int n) {
        if (n < 10 && n >= 0) {
            return n;
        } else {
            int lastDigit = n % 10;
            return lastDigit + sumOfDigits(n / 10);
        }
    }

    // Recursive function to calculate power of a number
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else return 1 / base * power(base, exponent + 1);
    }

    // Recursive function to perform binary search on an array
    static int binarysearch(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (array[mid] == target) return mid;
        else if (array[mid] < target) return binarysearch(array, target, mid + 1, end);
        else return binarysearch(array, target, start, mid - 1);
    }

    // Recursive function to reverse a string
    static String reverseString(String str) {
        if (str.isEmpty()) {
            return "";
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    // Recursive function to check if a string is palindrome
    static boolean isPalindrome(String input, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }
        return isPalindrome(input, start + 1, end - 1);
    }

    // Recursive function to solve Tower of Hanoi problem
    static void solveTowerOfHanoi(int n, char source, char destination, char helper) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to " + destination);
            return;
        }
        solveTowerOfHanoi(n - 1, source, helper, destination);
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
        solveTowerOfHanoi(n - 1, helper, destination, source);
    }

    // Recursive function to perform merge sort on an array
    static void mergesort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[j + mid];
        }

        mergesort(left);
        mergesort(right);

        merger(array, left, right);
    }

    // Helper function for merge sort to merge two sorted arrays
    static void merger(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[i]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Recursive function to reverse an array
    static void reverse_array(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;

        reverse_array(array, left + 1, right - 1);
    }

    // Recursive function to print numbers from 1 to n
    static void print_1ton(int n) {
        if (n < 1) {
            return;
        }
        print_1ton(n - 1);
        System.out.println(n);
    }

    // Recursive function to print numbers from start to end
    static void print_1ton_BK(int start, int end) {
        if (start >= end) {
            return;
        }
        System.out.println(start);
        print_1ton_BK(start + 1, end);
    }

    // Recursive function to print numbers from n to 1
    static void printnto1(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printnto1(n - 1);
    }

    // Recursive function to calculate sum of numbers from 1 to n
    static int sum_to_n(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum_to_n(n - 1);
    }

    // Recursive function to calculate sum of numbers from 1 to n using tail recursion
    static void sum_to_n(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sum_to_n(n - 1, sum + n);
    }

    //swap helper function
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Recursive function to find the reverse of an array
    static void array_reverse(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        swap(array, left, right);

        array_reverse(array, left + 1, right - 1);

    }

    // Recursion function to find the reverse of a string
    static String string_reverse(String str) {
        if (str.length() <= 1) {
            return str;
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        String substrin = str.substring(1, str.length() - 1);
        String reversedString = string_reverse(substrin);
        return lastChar + reversedString + firstChar;
    }

    // Check palindrome
    static boolean Palindrome(String str) {
        if (str.length() <= 1) {
            return true;
        } else {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                return Palindrome(str.substring(1, str.length() - 1));
            } else {
                return false;
            }
        }
    }

    static boolean isPalindrome(String string) {
        if (string.length() <= 1) {
            return true;
        } else {
            return isPalindromeHelper(string, 0, string.length() - 1);
        }
    }

    static boolean isPalindromeHelper(String string, int start, int end) {
        if (start >= end) {
            return true;
        } else if (string.charAt(start) != string.charAt(end)) {
            return false;
        } else {
            return isPalindromeHelper(string, start + 1, end - 1);
        }
    }

    static int exponentiation_recursive(int a, int b){
        if(b==0){
            return 1;
        }else if(b==1){
            return a;
        }else{
            int temp=exponentiation_recursive(a,b/2);
            int result= temp*temp;
            if(b%2==1){
                result=result*a;
            }
            return result;
        }
    }

    static int exponentiation_iterative(int a, int b){
        int result=0;
        while(b>0){
            if(b%2==1){
                result= result*a;
            }
            a*=a;
            b/=2;
        }
        return result;
    }

    

    public static void printSubsequences(int[] arr) {
        printSubsequencesHelper(arr, new ArrayList<>(), 0);
    }

    public static void printSubsequencesHelper(int[] array, List<Integer> current, int index) {
        if (index >= array.length) {
            System.out.println(current);
            return;
        }

        current.add(array[index]);
        printSubsequencesHelper(array, current, index + 1);
        current.remove(current.size() - 1);
        printSubsequencesHelper(array, current, index + 1);
    }




    public static void main(String[] args) {
        // Example usage of the recursive functions
        // Uncomment the function calls to test them
        // f(); // An example of an infinite recursion
        // System.out.println(factorial(5)); // Output: 120
        // System.out.println(fib(6)); // Output: 8
        // System.out.println(sum(10)); // Output: 55
        // System.out.println(sumOfDigits(12345)); // Output: 15
        // System.out.println(power(10,6)); // Output: 1000000
        // int[] a= {1,2,3,-5,5,6,7,8};
        // System.out.println(binarysearch(a, 5, 0, a.length-1)); // Output: 4
        // System.out.println(reverseString("aman")); // Output: nama
        // System.out.println(isPalindrome("racecar", 0, 6)); // Output: true
        // int n = 3; // number of disks
        // char source = 'A', destination = 'C', helper = 'B';
        // solveTowerOfHanoi(n, source, destination, helper);
        // int[] a= {8,5,3,9,1,4};
        // mergesort(a);
        // System.out.println(Arrays.toString(a)); // Output: [1, 3, 4, 5, 8, 9]
        // int[] a= {1,2,3,-5,5,6,7,8};
        // reverse_array(a,0,a.length-1);
        // System.out.println(Arrays.toString(a)); // Output: [8, 7, 6, 5, -5, 3, 2, 1]
        // print_1ton(5); // Output: 1 2 3 4 5
        // print_1ton_BK(1,5); // Output: 1 2 3 4
        // printnto1(5); // Output: 5 4 3 2 1
        // System.out.println(sum_to_n(6)); // Output: 21
        // sum_to_n(11,0); // Output: 66
//        array_reverse(a,0, a.length-1);
//        System.out.println(Arrays.toString(a));
//        int[] arr = {5, 69, 5, 1, 2, 3};
////        System.out.println("Subsequences of " + Arrays.toString(arr) + ":");
////        printSubsequences(arr);
////        System.out.println();

        System.out.println(exponentiation_recursive(5,11));
    }
}
