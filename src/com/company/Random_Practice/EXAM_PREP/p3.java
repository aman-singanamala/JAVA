package com.company.Random_Practice.EXAM_PREP;

import java.util.HashSet;

public class p3 {
    public static void pat(int n) {
        for(int i=0;i<n;i++){
            int number =1;
            System.out.printf("%"+ (n-i)*2+"s"," ");
            for(int j=0;j<=i;j++){
                System.out.printf("%4d",number);
                number= number*(i-j)/(j+1);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pat(5);
    }
}