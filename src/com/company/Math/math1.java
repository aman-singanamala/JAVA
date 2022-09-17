package com.company.Math;

public class math1 {
    public static void main(String[] args){
//        int n=98;
//        System.out.println(isOdd(n));
        int[] a = {1,1,2,2,3,4,5,5,6,6,77,3,4};
        int ans= findUnique(a);
        System.out.println(ans);
        System.out.println(findnth(5));
    }
    public static boolean isOdd(int n){
        return (n & 1) ==1;
    }
    public static int findUnique(int[] array){
        int unique=0;
        for(int n: array){
            unique= unique^ n;
        }
        return unique;
    }
    public static int findnth(int n){
        return n & ( 1<< n);
    }
}
