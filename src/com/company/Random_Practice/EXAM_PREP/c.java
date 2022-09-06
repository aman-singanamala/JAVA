package com.company.Random_Practice.EXAM_PREP;

public class c {
    public static void patter_3(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=(n-i);space++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patter_3(5);
    }
}
