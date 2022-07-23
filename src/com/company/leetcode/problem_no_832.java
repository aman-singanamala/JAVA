package com.company.leetcode;

public class problem_no_832 {
    public int[][] flipAndInvertImage(int[][] image){
        for (int i = 0; i < image.length; i++) {
            flip(image[i]);
            invert(image[i]);
        }
        return image;
    }
    static void flip(int[] array){
        for(int i=0;i< array.length*0.5;i++){
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]= temp;
        }
    }
    static void invert(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]=1-array[i];
        }
    }

    public static void main(String[] args) {
        problem_no_832 ob = new problem_no_832();
        int[][] a= {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] ans = ob.flipAndInvertImage(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
