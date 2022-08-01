package com.company.TwoPointer;

public class check_sum_pair {
    public int[] isPairSum(int[] A,int X){
        int i=0;
        int j= A.length-1;
        while(i<j){
            if(A[i]+A[j]==X){
                return new int[]{i, j};
            } else if (A[i]+A[j]>X) {
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        check_sum_pair ob = new check_sum_pair();
        int[] a={2, 3, 5, 8, 9, 10, 11};
        int[] ans = ob.isPairSum(a,17);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
