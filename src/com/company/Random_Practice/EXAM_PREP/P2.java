package com.company.Random_Practice.EXAM_PREP;

public class P2 {
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 2*(n-i); j >=0 ; j--) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
