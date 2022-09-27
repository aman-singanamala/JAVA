package com.company.Random_Practice;


// Java implementation to find the
// minimum number of operations in
// which the array A can be converted
// to another array B
public class Test {

    // Function to find the minimum
    // number of operations in which
    // array A can be converted to array B
    static int getMinCost(int [] A, int [] B,
                          int N)
    {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++)
        {
            mini = Math.min(mini,
                    Math.min(A[i], B[i]));
        }

        // Return the total minimum cost
        return mini * (2 * N - 1);
    }

    // Driver Code
    public static void main(String[] args)
    {
        int N = 5;

        int [] A = { 1,5,3,5,5 };
        int [] B = { 1,2,3,4,5 };

        System.out.print(getMinCost(A, B, N));
    }
}

// This code is contributed by AnkitRai01

