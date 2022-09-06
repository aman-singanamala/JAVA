package com.company.Random_Practice.EXAM_PREP;

public class b {
    public static void pattern_2(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=2*(n-i);j>=0;j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern_2(5);
    }
}
