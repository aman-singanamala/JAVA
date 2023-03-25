package com.company.Random_Practice.TCS_NINJA;

public class problems {
    static boolean compare_rotation(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String s3= s2+s2;
        return s3.contains(s1);
    }


    static int gcd(int a, int b){
        if(b==0){
            return a;
        }else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
//        String s1= "abcd";
//        String s2= "bcda";
//        System.out.println(compare_rotation(s1, s2) ? "Rotated strings" : "Not rotated strings");

        int gcd= gcd(90,70);
        System.out.println(gcd);
    }
}