package com.company.arrays_java;

import java.util.Scanner;

public class _4_grid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n= in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
