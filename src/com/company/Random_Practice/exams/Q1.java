package com.company.Random_Practice.exams;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y;
        try{
            x=in.nextInt();
            y=in.nextInt();

            if(is32BitSignedInteger(x) && is32BitSignedInteger(y)){
                if(y!=0){
                    System.out.println(x/y);
                }else{
                    System.out.println("Exception : Division by zero is not possible");
                }
            }else{
                System.out.println("Exception: Both x and y must be 32 digit Integers");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static boolean is32BitSignedInteger(int num){
        return num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE;
    }
}