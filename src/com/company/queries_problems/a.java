/*
You are given an array of n elements, initially all a[i] = 0.
Q queries need to be performed.
Each query contains three integers l, r, and x  and
you need to change all a[i] to (a[i] | x) for all l ≤ i ≤ r.

Return the array after executing Q queries.
 */

package com.company.queries_problems;
import java.util.*;
public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[][] queries = new int[q][3];
        for(int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
            queries[i][2] = sc.nextInt();
        }
        // Call the function to execute the queries and print the output
        int[] result = executeQueries(n, q, queries);
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] executeQueries(int n, int q, int[][] queries) {
        int[] arr = new int[n];
        for(int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int x = queries[i][2];
            for(int j = l - 1; j < r; j++) {
                arr[j] |= x;
            }
        }
        return arr;
    }

}