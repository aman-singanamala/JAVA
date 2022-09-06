package com.company.Random_Practice.EXAM_PREP;

public class a {
    public static void pattern_1(int n){
        int i,j;
        for (i = 0; i <n ; i++) {
            for (j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_1(5);


    }
}
