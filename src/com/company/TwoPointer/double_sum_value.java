package com.company.TwoPointer;

import java.util.Arrays;

public class double_sum_value {
    public void function(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        for (int i = n - 1; i >= 0; i--) {
            int l = 0;
            int r = i - 1;
            while (l < r) {
                if (A[l] + A[r] == A[i]) {
                    System.out.print(A[i] + " ");
                    System.out.print(A[l] + " ");
                    System.out.print(A[r] + " ");
                    System.out.println();
                    return;}
                    else if (A[l] + A[r] > A[i]) {
                        r--;
                    }
                    else{
                        l++;
                    }
                }
            }
        }




    public static void main(String[] args) {
        double_sum_value ob= new double_sum_value();
        int[] a={5, 32, 1, 7, 10, 50, 19, 21, 2};
        ob.function(a);

    }
}
